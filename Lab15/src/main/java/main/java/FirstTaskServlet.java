package main.java;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.mail.*;

@WebServlet(name = "message", urlPatterns = "/message")
public class FirstTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ServletContext context = req.getServletContext();
            resp.getWriter().println(EmailAdmin.showMessages(context.getInitParameter("UserEmail"),
                    context.getInitParameter("UserPassword")));
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
