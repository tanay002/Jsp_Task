package com.bytecoder.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/facebook")
public class MyServlet extends GenericServlet //Abstract class
{        //GenericServelet have overidded the other four method excepts the service method

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
     PrintWriter ps= res.getWriter();
     ps.println("My Second Servlet....Thanx");
	}

}
