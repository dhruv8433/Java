<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!--  we have to first download jstl-1.2.jar check in libraries/Refrenced libraries/ -->
<!--  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> -->
    
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
    
    <!--<c:out value="Hello world" />
    <!-- <c:import url="https://erequirement-v2.vercel.app"></c:import> --> 
</body>
</html>
