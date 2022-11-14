

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado da venda</title>
    </head>
    <body>
        <h1>Venda do Produto</h1>
        <%
            String nome_produto = request.getParameter("produto");
            float valor = Float.parseFloat(request.getParameter("valor"));
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            
            out.print("Nome do produto: " + nome_produto + "<br>");
            out.print("Valor unitário: " + valor + "<br>");
            out.print("Quantidade: " + quantidade + "<br>");
            out.print("Total: " + (valor * quantidade));
        %>
    </body>
</html>
