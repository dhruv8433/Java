

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no1 = Integer.parseInt(request.getParameter("sub1"));
		int no2 = Integer.parseInt(request.getParameter("sub2"));
		int no3 = Integer.parseInt(request.getParameter("sub3"));
		
		Cookie cookie = new Cookie("no1", no1 + "");
		Cookie cookie1 = new Cookie("no2", no2 + "");
		Cookie cookie2 = new Cookie("no3", no3 + "");
		
		response.addCookie(cookie);
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.sendRedirect("CookiesServlet2");
	}

}
