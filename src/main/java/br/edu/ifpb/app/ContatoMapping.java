package br.edu.ifpb.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/path/*", "*.ext"})
public class ContatoMapping extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpServletMapping servletMapping = request.getHttpServletMapping();
        response.getWriter()
                .append("<html><body>")
                .append("Valor: ").append(servletMapping.getMatchValue())
                .append("<br/>")
                .append("Padrão: ").append(servletMapping.getPattern())
                .append("<br/>")
                .append("Mapping: ").append(servletMapping.getMappingMatch().name())
                .append("<br/>")
                .append("Servlet: ").append(servletMapping.getServletName())
                .append("<br/>")
                .append("</body></html>");
    }
}
