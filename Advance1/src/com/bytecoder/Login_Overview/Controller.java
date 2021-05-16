package com.bytecoder.Login_Overview;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Controller")
public class Controller extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String u=req.getParameter("unname");
		String p=req.getParameter("pwd");
		if(u.equals("tanay")&&p.equals("1234"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("/home");
			rd.forward(req, res);

		}
		else
		{
			RequestDispatcher rd1=req.getRequestDispatcher("/login1");
			rd1.include(req, res);
		PrintWriter ps=res.getWriter();
		ps.println("Invalid Id/Password");
		}
	}
}
