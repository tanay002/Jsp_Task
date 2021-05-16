package com.bytecoder.jdbcSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcSelectQuery19
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		PreparedStatement ps=con.prepareStatement("select * from dbase;");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("name")+" "+rs.getString("city")+" "+rs.getString("mobileno"));
		}

	}
}
