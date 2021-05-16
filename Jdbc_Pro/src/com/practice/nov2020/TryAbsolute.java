package com.practice.nov2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;




public class TryAbsolute
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
	//Driver d=new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/apnacafe","root","root");
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs= st.executeQuery("select * from register");
	rs.last();
	while(rs.previous())
	{
		
		System.out.println(rs.getString("emp_name"));

	}
	 
	 
	}
}
