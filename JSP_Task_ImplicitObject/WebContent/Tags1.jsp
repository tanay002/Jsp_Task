<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!--  There are 3 types of tage  i)Scriplet Jag
                                   ii>declaration tag
                                    iii>Expression tag
                                    -->

<%int i=20;
int j=10;
out.println(i+j);%>
	<%  //Scriplet Tag1
                                
                                /* public void demo() 
                                    {
                                    	//we can't create method in scriplet tag..because jo hum code scriplet tag me likhte hai wo service method 
                                    	//ke andar jata hai
                                    }  */
                                    %>


	                           <% //Scriplet Tag2
                                    //The variable which we create inside sriplet tag is bydefault local variable
                                    //because jo hum code scriplet tag me likhte hai wo service method 
                                    	//ke andar jata hai...aur method ke andar variable local rahta hai
                                    int localVar=10;
                                    out.println(localVar);//out is an implicit object of Jsp (of class JspWriter)
                                    out.println(global);
                                    
                                    %>

	<%!
                                
                                    //decalaration tag
                                    int global=20;  //variable declared within class but outside service method
                                    
                                    public void demo()
                                    {
                                    	int loc=10;
                                 //   	out.print(); //we can't write implicit object of jsp of class jspwriter inside decalaration tag 
                                    	        //out is obj of jspwriter so we can use only in scriplet tag not in decalaration tag
                                    	        //cte (out cannot be resolved)
                                    }
                                   
                                    %>
 <%=global%>
 <%=localVar%>
<%--  <%=loc%> --%>
</body>
</html>