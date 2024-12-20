

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AvgServlet
 */
@WebServlet("/AvgServlet")
public class AvgServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Getting Data from request object
		int no1 = Integer.parseInt(request.getParameter("sub1"));
		int no2 = Integer.parseInt(request.getParameter("sub2"));
		int no3 = Integer.parseInt(request.getParameter("sub3"));
		
		System.out.print("Nos" + no1 + no2 + no3);
		
		// Perform sum
		int k = no1 + no2 + no3;
		
		
		// Perform avg
		int avg = k / 3;
		
		response.getWriter().append("Sum is : " + k).append("Avg is : " + avg);
	}

}
