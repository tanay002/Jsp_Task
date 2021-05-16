package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//executeUpdate
public class JdbcTask14
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		int row;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
		Scanner sc=new Scanner(System.in);
		String name,city,mobileno,college;
		System.out.println("Enter name city mobileno college");
		name=sc.next();
		city=sc.next();
		mobileno=sc.next();
		college=sc.next();
		PreparedStatement ps=  con.prepareStatement("insert into dbase (name,city,mobileno,college) values (?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, city);
		ps.setString(3, mobileno);
		ps.setString(4, college);
		row=ps.executeUpdate();	
	}
}

