

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class forwardServlet
 */
@WebServlet("/forwardServlet")
public class forwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int no1 = Integer.parseInt(request.getParameter("sub1"));
		int no2 = Integer.parseInt(request.getParameter("sub2"));
		int no3 = Integer.parseInt(request.getParameter("sub3"));
		
		
		response.sendRedirect("forwardServlet2?no1=" + no1 + "&no2=" + no2 + "&no3=" + no3);
	}

}
