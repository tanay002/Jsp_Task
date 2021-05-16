package com.bytecoder.jdbcSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSelectQuery21
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement st=con.createStatement();
		String s="select * from dbase where id between 12 and 20";
		ResultSet rs=st.executeQuery(s);
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("city")+" "+rs.getString("mobileno"));
		}

	}
}
