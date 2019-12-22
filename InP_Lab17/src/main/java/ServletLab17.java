import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet", urlPatterns = "/servlet")
public class ServletLab17 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        try
        {
            printWriter.println("x = " + req.getParameter("x") + "");
            printWriter.println("y = " + req.getParameter("y"));
            printWriter.close();
        }
        catch (Exception ex)
        {
            printWriter.println("Error: " + req.getParameter("y"));
        }
    }
}
