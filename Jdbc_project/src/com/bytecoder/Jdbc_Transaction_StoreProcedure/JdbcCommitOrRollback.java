package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcCommitOrRollback 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		String name,city,college; int mobileno;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		con.setAutoCommit(false);
		System.out.println("Enter no of data to insert");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		PreparedStatement ps=con.prepareStatement("insert into dbase (name,city,mobileno,college) values (?,?,?,?);");
		System.out.println("Enter name city mobileno College");
		for(int i=0;i<c;i++)
		{ 
			name=sc.next();
			city=sc.next();
			mobileno=sc.nextInt();
			college=sc.next();
			ps.setString(1,name);
			ps.setString(2,city);
			ps.setInt(3,mobileno);
			ps.setString(4,college);
			ps.executeUpdate();
		}

		System.out.println("\nInsert 'c' for Commit or 'r' for Rollback");
		String ch=sc.next();

		if(ch.equalsIgnoreCase("c"))
			con.commit();
		else if(ch.equalsIgnoreCase("r"))
			con.rollback();

	}
}
