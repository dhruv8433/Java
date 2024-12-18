package com.firstServlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SqrtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// fetching sum from servlet 1 
		// int sum = (int) req.getAttribute("sum");  // REQUEST DISPATCHER METHOD
		int sum = Integer.parseInt(req.getParameter("sum"));
		
		PrintWriter out = res.getWriter();
		out.println("Welcome to sqrtServlet");
		
		out.println("Sum :" + sum );
		
		sum *= sum;
		out.println("Sqrt is: " + sum );
		
		// 2. Redirect Method
		System.out.print("SQRT called");
		
	}
}
