package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JdbcTask5
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement s=con.createStatement();
		
		System.out.println("Enter total data to delete based on id:");
		 Scanner sc=new Scanner(System.in); 
		 int size=sc.nextInt(); 
		 int id;
		 for(int i=0;i<size;i++)
		 {  
		 System.out.println("Enter id");
		 id=sc.nextInt();
		String qu="delete from dbase where id='"+id+"';";
		s.execute(qu);
		 }	
		s.close();
		con.close();
		

	}
}
