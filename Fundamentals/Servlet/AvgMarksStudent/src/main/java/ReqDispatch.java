

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ReqDispatch
 */
@WebServlet("/ReqDispatch")
public class ReqDispatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Parse input parameters
        int no1 = Integer.parseInt(request.getParameter("sub1"));
        int no2 = Integer.parseInt(request.getParameter("sub2"));
        int no3 = Integer.parseInt(request.getParameter("sub3"));

       // Create and set parameters for servlet
        request.setAttribute("sub1", no1);
        request.setAttribute("sub2", no2);
        request.setAttribute("sub3", no3); 
    
        // Create Request Dispatcher
        RequestDispatcher dispatch = request.getRequestDispatcher("/ReqDispatcher2");
        
        // Forward all req and res to that dispatcher
        dispatch.forward(request, response);
    }
    
    
}
