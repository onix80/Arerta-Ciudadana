<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
        <meta name="viewpoint" content="width=device--width, initial-scale=1.0">

    </head>
    <body>
        <h1> Victimas de hurtos </h1>
        
        <table
         border ="2" width=80%>
        
            <thead> <th>NOMBRE</th> <th>EDAD</th> <th>CIUDAD</th> <c:forEach var= "cliente" items="${clientes}"></thead>
                
                
            <thead>
               <li> <th>${cliente.nombre}</th> <th>  ${cliente.edad}</th> <th>  ${cliente.ciudad} </th> </li>
            </thead>           
           </c:forEach>
         
        </table>   
            
        


    </body>
</html>
