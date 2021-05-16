package com.bytecoder.Login_Overview;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/home")
public class Home extends HttpServlet 
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	PrintWriter ps=res.getWriter();
	ps.println("Welcome to Home Page");
	
}

}
