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
/* String k2=request.getContentType(); */
/* String k=request.getServerName();
out.println(k2+" "+k); */

String namereq=request.getParameter("uname");
request.setAttribute("username","bheru");
request.removeAttribute("username");
String name=(String)request.getAttribute("username");
%>
<%="Welcome "+name %>
<%="Welcome "+namereq %>
</body>
</html>