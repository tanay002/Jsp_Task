

package com.bytecoder.LoginProcess;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home11")
public class WelcomePage extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter ps=res.getWriter();
		ps.println("Welcome to Home Page<br>");
		
		/*
		res.setHeader("Cache-Control", "no-cache, no-store,must-revalidate");
		HttpSession ses=req.getSession();
		if(ses.getAttribute("UserName")==null)
		{
			res.sendRedirect("/login");
		}
		  */    
		ps.print("<a href='pa'>page1</a><br>");
		ps.print("<a href='pa2'>page2</a><br>");
		ps.print("<a href='pa3'>page3</a><br>");
		ps.print("<a href='lo'>logout</a>");

	}
}
