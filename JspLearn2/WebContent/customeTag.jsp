<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="/WEB-INF/custometags2.tld" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--Custome Tag
1.Tag handler class
2.mapping of tag handler class in tld file
3. We use taglib directive to use our custome Tag
  -->
  <c:sum value="10,30,40,50,80,90,20">
<!-- tag body -->
  </c:sum>
  
</body>
</html>
