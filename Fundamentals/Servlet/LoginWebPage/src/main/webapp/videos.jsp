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
	
		if(session.getAttribute("uname")==null){
			response.sendRedirect("login.jsp");
		}
	
	%>
	
	<iframe width="960" height="500" src="https://www.youtube.com/embed/CwUVD7akiaM?si=8rSe8uJBmvEKcMzF" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>

</body>
</html>