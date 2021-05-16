package com.bytecoder.LoginProcess;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/controller1")
public class ControllerRegistration extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{ 
		int j=0;
		String unname=req.getParameter("unname");
		String pwd=req.getParameter("pwd");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String adharno=req.getParameter("adharno");
		int i=Integer.parseInt(adharno);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/process","root","root");

			PreparedStatement ps1=con.prepareStatement("insert into db values(?,?,?,?,?)");
			ps1.setString(1, unname);
			ps1.setString(2, pwd);
			ps1.setString(3, email);
			ps1.setString(4, mobile);
			ps1.setInt(5,i);

			 j=ps1.executeUpdate();
			System.out.println(j);


			if(j>0)
			{  
				RequestDispatcher rd=req.getRequestDispatcher("/login");
				rd.forward(req,res);
			}	

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}