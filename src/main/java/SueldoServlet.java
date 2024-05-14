import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SueldoServlet")
public class SueldoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        PrintWriter out = response.getWriter();

        String nombre = request.getParameter("nombre");
        double sueldoDiario = Double.parseDouble(request.getParameter("sueldoDiario"));
        int diasTrabajados = Integer.parseInt(request.getParameter("diasTrabajados"));

        if (diasTrabajados < 1 || diasTrabajados > 15) {
            out.println("La cantidad de días trabajados debe estar entre 1 y 15.");
            return;
        }

        Empleado empleado = new Empleado(nombre, sueldoDiario, diasTrabajados);
        double sueldoTotal = empleado.calcularSueldo();
        response.setCharacterEncoding("UTF-8");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado del Calculo de Sueldo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado del Calculo de Sueldo</h1>");
        out.println("<p>Nombre: " + empleado.getNombre() + "</p>");
        out.println("<p>Sueldo Diario: " + empleado.getSueldoDiario() + "</p>");
        out.println("<p>Días Trabajados: " + empleado.getDiasTrabajados() + "</p>");
        out.println("<p>Sueldo Total: " + sueldoTotal + "</p>");
        out.println("<a href='index.jsp'>Volver</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
