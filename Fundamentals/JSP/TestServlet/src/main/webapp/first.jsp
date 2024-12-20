<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Response Page</title>
</head>
<body bgcolor="cyan">
	<!-- Import package and we can add multiple packages by adding coma(,) -- called Directive -->
	<%@ page import="java.lang.Math, java.util.random.*" %>
	
	<!-- Include custom header that we reuse everywhere -->
	<%@ include file="header.jsp" %>

    <!-- JSP by default gives the request object -- want to print something -- called expression -->
    <h1>Welcome back, <%= request.getParameter("myname") %>!</h1>
    
    <!-- Defining variable -- called declaration section -->
	<%! int a = 10;	%>
	
	<!-- Just Want to Print  something -- called scriptlet section -->
	<% out.print("a value is " + a); %>
</body>
</html>
