
public class Empleado {
    private String nombre;
    private double sueldoDiario;
    private int diasTrabajados;

    public Empleado(String nombre, double sueldoDiario, int diasTrabajados) {
        this.nombre = nombre;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoDiario() {
        return sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public double calcularSueldo() {
        return sueldoDiario * diasTrabajados;
    }
}
