package com.firstServlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SqtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Inside Get Method");
		
		PrintWriter out = res.getWriter();
		out.print("Welcome to sqtServlet");
		
	}
}
