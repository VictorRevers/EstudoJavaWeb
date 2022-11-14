package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CalculaSalario", urlPatterns = {"/CalculaSalario"})
public class CalculaSalario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Float salario = Float.parseFloat(request.getParameter("salario"));
        Float percent = Float.parseFloat(request.getParameter("percent"));
        Float novo_salario = salario + salario * percent/100;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculaSalario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculo do salário:" + "</h1>");
            out.println("Nome: " + nome +  "<br>");
            out.println("Salario atual: R$ " + salario +  "<br>");
            out.println("Percentual: " + percent +  "%<br>");
            out.println("Novo salário: R$ " + novo_salario +  "<br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
