

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
		// TODO Auto-generated method stub
		int no1 = (int) request.getAttribute("no1");
		int no2 = (int) request.getAttribute("no2");
		int no3 = (int) request.getAttribute("no3");
		
		int addition = no1 + no2 + no3;
		
		int avg = addition / 3;
		
		response.getWriter().append("No 1: " + no1 + "No2: "+ no2 + "No 3: " + no3).append("sum :" + addition).append("Avg :" + avg);
	}

}
