

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venda de mercadoria</title>
    </head>
    <body>
        <h1>Dados da venda</h1>
        <form method="post" action="venda">
            Nome do produto: <br>
            <input type="text" name="produto"><br>
            Quantidade: <br>
            <input type="text" name="quantidade"><br>
            Valor:<br>
            <input type="text" name="valor"><br>
            <input type="submit" value="calcular">
            
        </form>
        
    </body>
</html>
