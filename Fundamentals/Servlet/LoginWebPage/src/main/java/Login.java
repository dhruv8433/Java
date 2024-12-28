

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		if(uname.equals("dhruv") && password.equals("1234")) {
			// if user is logged in set it into session
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
			session.setAttribute("password", password);
			
			// redirect to welcome page
			response.sendRedirect("welcome.jsp");
		}else {
			// if credential is wrong, than redirect back to login
			response.sendRedirect("login.jsp");
		}
		
	}

}
