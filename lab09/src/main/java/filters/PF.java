package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "PF", urlPatterns = "/Ccc.jsp")
public class PF implements Filter {
    public void destroy() {
        System.out.println("PF: destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("PF: doFilter");
        req.getRequestDispatcher("/Page1.jsp").forward(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("PF: init");
    }

}
