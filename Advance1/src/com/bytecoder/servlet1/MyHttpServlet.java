package com.bytecoder.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/amazon")
public class MyHttpServlet extends HttpServlet
{
@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	//super.doGet(req, res);
PrintWriter ps=res.getWriter();
ps.println("Hello, My HttpServlet");
}
}
