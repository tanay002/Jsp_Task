package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcTask7
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		//String qu="alter table dbase add primary key (id)";   
		String qu="alter table dbase add auto increment (id)";
		   Statement s=con.createStatement();
		s.execute(qu);	
		s.close();
		con.close();
		

	}
}
