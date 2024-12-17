package com.firstServlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SqrtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// fetching sum from servlet 1 
		int sum = (int) req.getAttribute("sum");
		
		PrintWriter out = res.getWriter();
		out.println("Welcome to sqrtServlet");
		
		out.println("Sum :" + sum );
		
		sum *= sum;
		out.println("Sqrt is: " + sum );
		
	}
}
