

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ReqDisServlet
 */
@WebServlet("/ReqDisServlet")
public class ReqDisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no1 = Integer.parseInt(request.getParameter("sub1"));
		int no2 = Integer.parseInt(request.getParameter("sub2"));
		int no3 = Integer.parseInt(request.getParameter("sub3"));
		
		request.setAttribute("no1", no1);
		request.setAttribute("no2", no2);
		request.setAttribute("no3", no3);
		
		RequestDispatcher dispacher = request.getRequestDispatcher("/ReqDispatcher2");
		dispacher.forward(request, response);
	}

}
