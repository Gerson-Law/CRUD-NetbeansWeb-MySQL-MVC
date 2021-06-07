<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" align="center">
            <div class="row vh-100 justify-content-center  align-items-center">  
        <h1>Registro de personas</h1>
        <form action="recibir.do" method="POST">
            DUI:<input type="text" name="txtDui" value="" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"><br>
            Apellidos:<input type="text" name="txtApellidos" value="" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"><br>
            Nombres:<input type="text" name="txtNombres" value="" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"><br>
            <input type="submit" value="Registrar Nueva Persona" class="btn btn-success"><br>
        </form>
        <form action="mostrar.do" method="POST">
        <input type="submit" name="txtR" value="Ver Registro" class="btn btn-secondary"/><br>
        </form>
          <form action="actualizar.do" method="POST">
        <input type="submit" name="txtA" value="Actualizar Registro" class="btn btn-warning"/><br>
         </form>
          <form action="eliminar.do" method="POST">
        <input type="text" name="txtE" value="Eliminar Registro" class="btn btn-danger" />
         </form>
         </div>
         </div>
    </body>
</html>
