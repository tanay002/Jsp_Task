package com.bytecoder.LoginProcess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/pa")
public class Page1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter ps=res.getWriter();
		HttpSession ses=req.getSession(false);
		String UserName=(String)ses.getAttribute("user");
	ps.println("Welcome to page1- "+ UserName);
	ps.println("<br> Hello "+" "+UserName);
	ps.print("<a href='lo'><br>logout</a>");
	
	
	}
}
