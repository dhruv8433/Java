

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no1 = Integer.parseInt(request.getParameter("sub1"));
	    int no2 = Integer.parseInt(request.getParameter("sub2"));
	    int no3 = Integer.parseInt(request.getParameter("sub3"));    
		
		HttpSession session = request.getSession();
		session.setAttribute("sub1", no1);
		session.setAttribute("sub2", no2);
		session.setAttribute("sub3", no3);		
		
		response.sendRedirect("SessionServlet2");
	}

}
