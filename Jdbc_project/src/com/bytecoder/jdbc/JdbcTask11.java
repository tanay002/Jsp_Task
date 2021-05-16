package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//executeUpdate
public class JdbcTask11
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		int row;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
		Statement	st=con.createStatement();
		row=st.executeUpdate("update dbase set name='mayank',city='kerala' where id='203' ");
		System.out.println("Successfully Save "+row);
	}
}
