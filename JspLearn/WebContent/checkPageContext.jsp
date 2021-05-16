<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("uname", "Tanay Saxena",pageContext.REQUEST_SCOPE);
pageContext.setAttribute("name", "Rahul Dev",pageContext.SESSION_SCOPE);
pageContext.setAttribute("drivername", "com.mysql.jdbc.Driver",pageContext.APPLICATION_SCOPE);
%>
<a href="getCheckPageContext.jsp">Click here</a>
</body>
</html>