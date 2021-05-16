package com.practice.nov2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	 Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/apnacafe","root","root");
	Statement st=con.createStatement();
	ResultSet rs= st.executeQuery("select * from register where emp_id='"+1+"'");
	while(rs.next())
	{
		
		System.out.println(rs.getString("emp_name"));
	}
	 
	 
	}
}
