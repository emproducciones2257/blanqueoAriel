<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            body {
                background-color: black;
            }
            #titulo {
                text-align: center;
                color: white;
                border-bottom: white 0.1vw dashed;
                width: 30vw;
            }

            .cont {
                width: 30vw;
                text-align: center;
            }

            .exp_guardados {
                color: white;
            }
        </style>
    
    <h1 id="titulo">Listado De Causas</h1>
    
    <div class="cont">

        <h2 id="sub">Lista de campos guardados</h2>
       <a href="Servlet?ac=formulario"><button id="nuevo">Crear Expediente</button></a> 

    </div>
    </body>
    
    <footer>
    <p class="footer">Pagina Web creada por:</p>
    <p class="footer"> Emanuel, Ariel, Rocio </p>
</footer>
</html>
