package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//executeUpdate
public class JdbcTask8 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
		System.out.println("Enter total data to insert");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String name,city,mobileno,college;
		PreparedStatement ps=  con.prepareStatement("insert into dbase (name,city,mobileno,college) values (?,?,?,?)");
		for(int i=0;i<size;i++)
		{
			name=sc.next();
			city=sc.next();
			mobileno=sc.next();
			college=sc.next();
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, mobileno);
			ps.setString(4, college);
			ps.executeUpdate();	
		}
	}
}
