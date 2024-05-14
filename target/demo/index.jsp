
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Calculadora de Sueldo</title>
</head>
<body>
    <h1>Calculadora de Sueldooo</h1>
    <form action="SueldoServlet" method="post">
        Nombre: <input type="text" name="nombre" required><br>
        Sueldo Diario: <input type="number" step="0.01" name="sueldoDiario" required><br>
        Días Trabajados: <input type="number" name="diasTrabajados" required><br>
        <input type="submit" value="Calcular Sueldo">
    </form>
   
</body>
</html>