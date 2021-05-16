package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//executeUpdate with prepared statement
public class JdbcTask12
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
		System.out.println("Enter total data to insert");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String name,city,mobileno,college;
		System.out.println("Enter name to make change");
		System.out.println("Enter new name of 'city' and 'college'");
		PreparedStatement ps=  con.prepareStatement("update dbase set city=? ,college=? where name=?");
		for(int i=0;i<size;i++)
		{
			name=sc.next();
			city=sc.next();
			college=sc.next();
			ps.setString(1, city);
			ps.setString(2, college);
			ps.setString(3, name);
			ps.executeUpdate();	
		}
	}
}
