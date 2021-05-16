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
String s=(String)session.getAttribute("uname");
if(s==""||s==null)
{
response.sendRedirect("first.jsp");	
}
else
{
	out.println("Welcome tanay");
}
%>
</body>
</html>