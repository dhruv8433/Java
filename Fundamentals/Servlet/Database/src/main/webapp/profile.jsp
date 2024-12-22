<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- import java package -->    
<%@ page import="java.sql.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

try{	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
	
	out.print("Db Connected");
	Statement stmt = con.createStatement();
	
	String Sql = "select * from test";
	
	ResultSet rs = stmt.executeQuery(Sql);
	
	out.print("<br>");
	while(rs.next()) {
		out.print("ID: " + rs.getInt("id"));
		out.print("Age: " + rs.getInt("age"));
		out.print("Name: " + rs.getString("name"));
		out.print("<br>");
	}

}
catch(Exception e){
	out.println("Error in getting connection" + e.getMessage());
}

%>

</body>
</html>