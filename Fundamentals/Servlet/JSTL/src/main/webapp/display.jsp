<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Page</title>
</head>
<body>
    <%
       String name = request.getAttribute("lable").toString();
       out.print("Welcome Back, "+name);
       
    %>
    <br />
    Direct Method : ${lable}
</body>
</html>
