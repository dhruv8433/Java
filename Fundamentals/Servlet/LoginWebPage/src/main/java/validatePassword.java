import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class ValidatePassword
 */
@WebFilter("/validatePassword")
public class validatePassword implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	String password = request.getParameter("pass");
        // Cast to HttpServletRequest and HttpServletResponse
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        HttpSession session = req.getSession();
        String passw = (String) session.getAttribute("password");
        
        // Get the password parameter from the request
        System.out.print(passw);
        
        // Validate password length
        if (passw == null || passw.length() < 8) {
            // Redirect to an error page or return a response if validation fails
            res.getWriter().write("Password must be at least 8 characters long.");
            return;
        }

        // Pass the request along the filter chain if validation passes
        res.sendRedirect("welcome.jsp");
     }
}
