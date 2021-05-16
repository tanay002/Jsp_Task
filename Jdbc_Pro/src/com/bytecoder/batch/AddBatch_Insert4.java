package com.bytecoder.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddBatch_Insert4 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String name,city,college;
		int mobileno;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement ps=  con.createStatement();
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
			ps.addBatch("insert into dbase (name,city,mobileno,college) values ('"+name+"','"+city+"','"+mobileno+"','"+college+"')");
			System.out.println("Updation of mobileno,college where id=?");
			int mobileno1=sc.nextInt();
			String college1=sc.next();
			int id=sc.nextInt();
			ps.addBatch("update dbase set mobileno='"+mobileno1+"',college='"+college1+"' where id='"+id+"'");
			
		}
		ps.executeBatch();
	}
}