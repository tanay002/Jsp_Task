package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
//executeUpdate
public class JdbcTask10
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		int row;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
		Statement	st=con.createStatement();
		row=st.executeUpdate("insert into dbase (name,city,mobileno,college) values ('Rahul','singapore','878756543','kendriya')");
		System.out.println("Successfully Save "+row);
	}
}
