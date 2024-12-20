

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ReqDispatcher2
 */
@WebServlet("/ReqDispatcher2")
public class ReqDispatcher2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int no1 = (int) request.getAttribute("sub1");
		int no2 = (int) request.getAttribute("sub2");
		int no3 = (int) request.getAttribute("sub3");
		
		// Calculate sum
		int sum = no1+ no2+ no3;
		
		// Calculate Avg
		int avg = sum / 3;
		
		response.getWriter().append("Sum : " + sum + " Avg : " + avg);
	}

}
