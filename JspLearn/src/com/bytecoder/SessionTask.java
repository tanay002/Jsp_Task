package com.bytecoder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionn")
public class SessionTask extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
     HttpSession sess=req.getSession(); 
     sess.setAttribute("uname","tanay");
     res.sendRedirect("openSession.jsp");
	}
}
