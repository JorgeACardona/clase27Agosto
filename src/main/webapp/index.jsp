<%-- 
    Document   : index
    Created on : 31/08/2022, 02:18:14 AM
    Author     : andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese aqui</h1>
        <form action="ControladorServlet" method="POST">
            <label for="Username">Nombre Usuario:</label><br>
            <input type="text" id="UserName" name="UserName" placeholder="Nombre Usuario">
            <br>
            <br>
            <label for="tipos">Seleccione un tipo:</label>
            <select id="tipos" name="tipos">
                <option value="empleado">Empleado</option>
                <option value="contratista">Contratista</option>
            </select>
            <br>
            <br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
