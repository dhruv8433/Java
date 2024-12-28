<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		/* we use header because if we logout and then click
		on back button it redirect back to welcome page with cache memory 
		we don't need it in secure page */
		
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
	
		// for HTTP 1.0 or other down
		response.setHeader("Pragma", "no-cache");
		
		// Proxy
		response.setHeader("Expires", "0");
				
		if(session.getAttribute("uname")==null){
			response.sendRedirect("login.jsp");
		}
	
	%>

	Welcome back ${uname}...!
	
	<a href="videos.jsp">click to view videos</a>
	
	<form action="Logout">
		<input type="submit" value="Logout" />
	</form>
	
</body>
</html>