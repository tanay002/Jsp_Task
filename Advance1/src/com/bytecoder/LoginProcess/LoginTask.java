package com.bytecoder.LoginProcess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class  LoginTask extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter ps=res.getWriter();
		PrintWriter ps1=res.getWriter();
		ps1.println("Successfully Registered...You can Login<br>");
				
		ps.println("<form action='controllerlogin'>"+
				"<table><tr><td>Username</td><td><input type='text' name='unname'></td></tr>"
				+"<tr><td>Password</td><td><input type='password' name='pwd'></td></tr>"
				+"<tr><td><input type='submit'></td></tr></table>" +"</form>" );
	}
}
