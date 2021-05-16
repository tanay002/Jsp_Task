package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcTask1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement s=con.createStatement();
	//	String qu="create table dbase (id int(10),name varchar(15),city varchar(10));"; //create table
		System.out.println("Enter total number of data to be inserted:");
				 Scanner sc=new Scanner(System.in); 
				 int size=sc.nextInt(); 
				 String qu;
				 String name;
				 String city;
				 int id;
				 System.out.println("Enter id,uname,city");
				 for(int i=0;i<size;i++)
				 {  
		
				 id=sc.nextInt();
				 name=sc.next();
				 city=sc.next();
		  qu="insert into dbase values('"+id+"','"+name+"','"+city+"');";     //insert data into table
		 	s.execute(qu);
				 }
		s.close();
		con.close();
		

	}
}
