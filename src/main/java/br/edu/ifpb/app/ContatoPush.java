package br.edu.ifpb.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 28/11/2017, 18:07:22
 */
@WebServlet("/push")
public class ContatoPush extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.newPushBuilder()
                .path("resources/images/java-ee-logo.png")
//                .path("resources/images/java-ee-logo.png")
                .push();

        getServletContext()
                .getRequestDispatcher("/home.jsp")
                .forward(request, response);
    }
}
