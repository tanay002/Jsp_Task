package com.bytecoder.Login_Overview;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login1")
public class LoginDemo extends HttpServlet 
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	PrintWriter ps=res.getWriter();
	ps.println("<form action='Controller'>" + "Username<input type='text'name='unname'>"+"&nbsp password<input type ='password'name='pwd'>"+" <input type='submit'>" + "</form> ");

}
}
