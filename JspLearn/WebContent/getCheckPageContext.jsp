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
out.println("<b>Welcome1 </b>"+pageContext.getAttribute("uname",pageContext.REQUEST_SCOPE));

out.println("<b>Welcome2 </b> "+pageContext.getAttribute("name",pageContext.SESSION_SCOPE));

out.println("<b>Driver </b>"+pageContext.getAttribute("drivername",pageContext.APPLICATION_SCOPE));
%>
</body>
</html>