<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%request.setAttribute("pass","123"); 
RequestDispatcher rd=request.getRequestDispatcher("second.jsp");
rd.forward(request,response);
%> --%>

<%=application.getInitParameter("driver") %>

<form action="second.jsp" method="get"><center>
<table>

<tr><td>Username</td><td>
<input type="text" name="uname"></td>
<td><input type="submit" value="Try"></td></tr>
</table></center>
</form>
 
</body>
</html>