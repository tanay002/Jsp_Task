package com.bytecoder.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcTask2 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root","root");
		
		CallableStatement cs=con.prepareCall("{call settdata(88780,'Raka')}");
		int i=cs.executeUpdate();
		System.out.println(i);
	/*	Statement s=con.createStatement();
		String qu="update dbase set city='delhi' where id='9'";  //update table
		s.execute(qu);
		*/		
		//s.close();
		con.close();
		

	}
}
