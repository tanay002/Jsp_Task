package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcTask3
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement s=con.createStatement();
		
		System.out.println("Enter total data to update based on id:");
		 Scanner sc=new Scanner(System.in); 
		 int size=sc.nextInt(); 
		 String city;
		 int id;
		 for(int i=0;i<size;i++)
		 {  
		 System.out.println("Enter id,city");
		 id=sc.nextInt();
		 city=sc.next();
		String qu="update dbase set city='"+city+"' where id='"+id+"'";
		s.execute(qu);
		 }	
		s.close();
		con.close();
		

	}
}
