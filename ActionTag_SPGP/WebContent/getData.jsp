<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.task.setget.UserDto" scope="session"/>
<jsp:setProperty property="*" name="obj"/>

<jsp:getProperty property="ename" name="obj"/>
<jsp:getProperty property="email" name="obj"/>
<jsp:getProperty property="epass" name="obj"/>


<%String setMyName="Rahul"; %>
<jsp:setProperty property="ename" name="obj" value="<%=setMyName%>"/>
<br>
<jsp:getProperty property="ename" name="obj"/>

</body>
</html>