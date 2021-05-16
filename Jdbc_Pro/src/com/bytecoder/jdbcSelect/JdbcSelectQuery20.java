package com.bytecoder.jdbcSelect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcSelectQuery20
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and id");
		String name=sc.next();
		int id=sc.nextInt();
		Statement st=con.createStatement();
		String s="select * from dbase where id='"+id+"' and name='"+name+"'";
		ResultSet rs=st.executeQuery(s);
		while(rs.next())
		{
			System.out.println(rs.getString("name")+" "+rs.getString("city")+" "+rs.getString("mobileno"));
		}

	}
}
