package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTask13 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement s=con.createStatement();
		String city="dubai";
		String qu="update dbase set city='"+city+"' where id='7'";  //update table
		s.execute(qu);
				
		s.close();
		con.close();
		

	}
}
