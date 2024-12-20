

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   // Parse input parameters
        int no1 = Integer.parseInt(request.getParameter("sub1"));
        int no2 = Integer.parseInt(request.getParameter("sub2"));
        int no3 = Integer.parseInt(request.getParameter("sub3"));
        
        // we add "" because of it store in string 
        Cookie sub1 = new Cookie("sub1", no1 + "");
        Cookie sub2 = new Cookie("sub2", no2 + "");
        Cookie sub3 = new Cookie("sub3", no3 + "");
        
        response.addCookie(sub1);
        response.addCookie(sub2);
        response.addCookie(sub3);
        
        response.sendRedirect("CookiesServlet2");
	}

}
