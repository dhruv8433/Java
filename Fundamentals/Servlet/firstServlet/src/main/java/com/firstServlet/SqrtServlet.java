package com.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SqrtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// fetching sum from servlet 1 
		// int sum = (int) req.getAttribute("sum");  // REQUEST DISPATCHER METHOD
		// int sum = Integer.parseInt(req.getParameter("sum")); // REDIRECT METHOD
		
//		HttpSession session = req.getSession();		
//		int sum = (int) session.getAttribute("sum");
		
		// 4. Get cookies
		int sum = 0;
		Cookie cookie[] = req.getCookies();
		
		for(Cookie c: cookie) {
			if(c.getName().equals("sum")) {
				sum = Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter out = res.getWriter();
		out.println("Welcome to sqrtServlet");
		
		out.println("Sum :" + sum );
		
		sum *= sum;
		out.println("Sqrt is: " + sum );
		
		// 2. Redirect Method
		System.out.print("SQRT called");
		
	}
}
