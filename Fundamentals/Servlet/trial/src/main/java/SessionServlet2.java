

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SessionServlet2
 */
@WebServlet("/SessionServlet2")
public class SessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		int no1 = (int) session.getAttribute("no1");
		int no2 = (int) session.getAttribute("no2");
		int no3 = (int) session.getAttribute("no3");
		
		int addition = no1 + no2 + no3;
		
		int avg = addition / 3;
		
		response.getWriter().append("No 1: " + no1 + "No2: "+ no2 + "No 3: " + no3).append("sum :" + addition).append("Avg :" + avg);
	}

}
