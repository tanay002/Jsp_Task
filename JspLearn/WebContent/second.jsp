<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%="My password is "+request.getAttribute("pass")%> --%>

<%=request.getParameter("uname")%>
<%-- <%=config.getInitParameter("user") %> --%>

<%=application.getInitParameter("driver") %>
</body>
</html>