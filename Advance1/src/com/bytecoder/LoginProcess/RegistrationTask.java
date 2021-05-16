package com.bytecoder.LoginProcess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Registration")
public class RegistrationTask extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter ps=res.getWriter();
		//ps.println(".....Login Page.....");
		ps.println("<form action='controller1'>"+
				"<table><tr><td>Username</td><td><input type='text' name='unname'></td></tr>"
				+"<tr><td>Password</td><td><input type='password' name='pwd'></td></tr>"
				+"<tr><td>Email</td><td><input type='text' name='email'></td></tr>"
				+ "<tr><td>MobileNo</td><td><input type='text' name='mobile'></td></tr>"
				+"<tr><td>Adharno</td><td><input type='text' name='adharno'></td></tr>"+
				"<tr><td><input type='submit'></td></tr></table>" +"</form>" );

	}
}
