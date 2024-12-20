

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CookiesServlet2
 */
@WebServlet("/CookiesServlet2")
public class CookiesServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// There are multiple cookies so we use array
		Cookie[] cookies = request.getCookies();
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;
		
		// We map each cookie and check for sub1, sub2 and sub3
		if(cookies != null) {
			for (Cookie c : cookies) {
				if(c.getName().equals("sub1")) {
					// Cookies come in string form so we type-cast to integer
					no1 = Integer.parseInt(c.getValue());
				}
				if(c.getName().equals("sub2")) {
					no2 = Integer.parseInt(c.getValue());
				}
				if(c.getName().equals("sub3")) {
					no3 = Integer.parseInt(c.getValue());
				}
			}
		}
		
		// Calculate Sum
		int sum = no1 + no2 + no3;
		
		// Calculate Avg
		int avg = sum / 3;
		
		response.getWriter().append("Sum : " + sum + " Avg : " + avg);
	}

}
