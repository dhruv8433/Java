

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
		
		Cookie[] cookies = request.getCookies();
		int no1 = 0, no2=0, no3=0;
		
		if(cookies != null) {
			for (Cookie c:cookies) {
				if(c.getName().equals("no1")) {   // cookie {key , vlaue} key == no1
					no1= Integer.parseInt(c.getValue());
				}
				if(c.getName().equals("no2")) {   // cookie {key , vlaue} key == no1
					no2= Integer.parseInt(c.getValue());
				}
				if(c.getName().equals("no3")) {   // cookie {key , vlaue} key == no1
					no3= Integer.parseInt(c.getValue());
				}
			}
		}
		
		int addition = no1 + no2 + no3;
		
		float avg = addition / 3;
		
		response.getWriter().append("No 1: " + no1 + "No2: "+ no2 + "No 3: " + no3).append("sum :" + addition).append("Avg :" + avg);
	}

}
