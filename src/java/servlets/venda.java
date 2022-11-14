
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "venda", urlPatterns = {"/venda"})
public class venda extends HttpServlet { 

    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        float valor = Float.parseFloat(request.getParameter("valor"));
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        float totalPagar = valor * quantidade;
        String produto = request.getParameter("produto");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado da venda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Venda do produto</h1>");
            out.println("Produto: "+ produto);
            out.println("Quantidade: "+ quantidade);
            out.println("Total a pagar R$ "+ totalPagar);
            out.println("</body>");
            out.println("</html>");
        }
        
        //response.sendRedirect("index.html");
    }
}
