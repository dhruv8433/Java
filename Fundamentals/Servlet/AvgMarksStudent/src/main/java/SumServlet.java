import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Parse input parameters
        int no1 = Integer.parseInt(request.getParameter("sub1"));
        int no2 = Integer.parseInt(request.getParameter("sub2"));
        int no3 = Integer.parseInt(request.getParameter("sub3"));

        // Redirect with query parameters
        String redirectUrl = String.format("AvgServlet?sub1=%d&sub2=%d&sub3=%d", no1, no2, no3);
        response.sendRedirect(redirectUrl);
    }
}
