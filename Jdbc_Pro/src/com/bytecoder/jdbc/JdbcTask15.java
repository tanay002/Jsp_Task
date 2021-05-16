package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//executeUpdate
public class JdbcTask15
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		int row;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
		PreparedStatement ps=  con.prepareStatement("delete from dbase where id>?");
		ps.setInt(1,100);
		row=ps.executeUpdate();	
	System.out.println("Successfully Done");
	}
}

