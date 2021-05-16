
package com.bytecoder.LoginProcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/controllerlogin")
public class ControllerLogin extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{  
		try
		{  

			String u=req.getParameter("unname");
			String p=req.getParameter("pwd");

			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/process","root","root");


			String query = "select * from db where unname='"+u+"' and pwd='"+p+"'   ";
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery(query);

			if(rs.next())
			{   res.setContentType("text/html");
			
			String us=req.getParameter("unname");
			String pwdd=req.getParameter("pwd");
			HttpSession ses=req.getSession(true);
			ses.setAttribute("user", us);
			ses.setAttribute("password", pwdd);
			RequestDispatcher rd=req.getRequestDispatcher("/home11");
			rd.forward(req, res);
			}
			else
			{   
				res.setContentType("text/html");

				RequestDispatcher rd=req.getRequestDispatcher("/login");
				rd.include(req, res);
				System.out.println("Invalid Username and password");

			}

		}	
		catch(Exception e)
		{
			e.printStackTrace();

		}
	}
}
