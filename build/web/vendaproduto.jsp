<%-- 
    Document   : vendaproduto
    Created on : 14 de nov. de 2022, 12:45:44
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venda de Mercadoria</title>
    </head>
    <body>
        <h1>Dados da venda</h1>
        <form method="post" action="resultdovenda.jsp">
            Produto:<br>
            <input type="text" name="produto"><br>
            Quantidade:<br> 
            <input type="text" name="quantidade"><br>
            Valor:<br>
            <input type="text" name="valor"><br>
            <input type="submit" value="calcular">
        </form>
    </body>
</html>
