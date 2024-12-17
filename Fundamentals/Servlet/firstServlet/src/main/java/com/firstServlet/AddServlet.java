package com.firstServlet;
//servlet file import here
import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

// for servlet req and res
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
	//servlet is server and it use service method -- life cycle method
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// by default getparameter give string value so we have to convert it into integer by type-casting
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int addition = i + j;
		
		System.out.print("Sum is " + addition);
		
		// we are using httpResponse res to write something on page
		PrintWriter out = res.getWriter();
		// printing in html format
		out.print("<html>");
			out.print("<body>");
				out.print("<h1>");
				out.print("Result is : "+addition); 
				out.print("</h1>");
			out.print("</body>");
		out.print("</html>");
	}
	
	//	this will only accept post method - to send data to server
	//	public void doPost(HttpServletRequest req, HttpServletResponse res) {
	//		System.out.println("Inside Post Method");
	//	}
	
	//	this will only accept Get method - to fetch data from server
	//	public void doGet(HttpServletRequest req, HttpServletResponse res) {
	//		System.out.println("Inside Get Method");
	//	}
}
