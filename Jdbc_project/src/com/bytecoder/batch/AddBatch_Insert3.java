package com.bytecoder.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddBatch_Insert3 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String name,city,college;
		int mobileno;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		PreparedStatement ps=  con.prepareStatement("insert into dbase (name,city,mobileno,college) values (?,?,?,?)");
		PreparedStatement ps1=  con.prepareStatement("update dbase set mobileno=?,college=? where id=?");
		System.out.println("Enter total data to insert:");
		Scanner sc=new Scanner(System.in);    
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{    
			System.out.println("Enter name city mobileno college for insertion");
			name=sc.next();
			city=sc.next();
			mobileno=sc.nextInt();
			college=sc.next();
			ps.setString(1,name);
			ps.setString(2,city);
			ps.setInt(3,mobileno);
			ps.setString(4,college);		
			ps.addBatch();
		}
		ps.executeBatch();

		for(int i=0;i<size;i++)
		{
			System.out.println("Enter new mobileno college for updation and id for updation");
			int mobileno2=sc.nextInt();
			String college2=sc.next();
			ps1.setInt(1,mobileno2);
			ps1.setString(2,college2);
			int id=sc.nextInt();
			ps1.setInt(3,id);
			ps1.addBatch();

		}
		ps1.executeBatch();

	}
}
