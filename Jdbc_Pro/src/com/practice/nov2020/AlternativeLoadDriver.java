package com.practice.nov2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;




public class AlternativeLoadDriver
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	//Driver d=new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/apnacafe","root","root");
	Statement st=con.createStatement();
	ResultSet rs= st.executeQuery("select * from register where emp_id='"+1+"'");
	while(rs.next())
	{
		
		System.out.println(rs.getString("emp_name"));
	}
	 
	 
	}
}
