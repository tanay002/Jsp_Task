package com.bytecoder.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddBatch_Insert2
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{int row[];
	Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	Statement s=con.createStatement();
	System.out.println("Enter total data to insert");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	String name,city,mobileno,college;
	for(int i=0;i<size;i++)
	{    
		name=sc.next();
		city=sc.next();
		mobileno=sc.next();
		college=sc.next();
		s.addBatch("insert into dbase (name,city,mobileno,college) values ('"+name+"','"+city+"','"+mobileno+"','"+college+"');");
		row=s.executeBatch();

	}
	}
}
