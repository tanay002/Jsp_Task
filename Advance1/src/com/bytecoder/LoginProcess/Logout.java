package com.bytecoder.LoginProcess;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/lo")
public class Logout extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		HttpSession ses = req.getSession(false);
		if (ses != null) 
		{
			ses.invalidate();
			res.sendRedirect("login");
		}

	}
}
