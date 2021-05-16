package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcStoreProcedure_Insert6
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String name,city,college;
		int mobileno;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		con.setAutoCommit(false);
		CallableStatement st=null;
		System.out.println("Enter no to insert data");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter name city mobileno college");
		for(int i=0;i<size;i++)
		{
			name= sc.next();
			city=sc.next();
			mobileno=sc.nextInt();
			college=sc.next();
			st=con.prepareCall("{call spInsert('"+name+"','"+city+"','"+mobileno+"','"+college+"')}");
			st.executeUpdate();

		}
		con.commit();

	}
}

/*
 * DELIMITER $$ CREATE PROCEDURE spInsert(Ename VARCHAR(10),Ecity
 * VARCHAR(10),Emobileno INT,Ecollege VARCHAR(10)) BEGIN INSERT INTO dbase
 * (NAME,city,mobileno,college) VALUES (Ename,Ecity,Emobileno,Ecollege); END $$
 * 
 * CALL spInsert('Tnn','indore',990,'iit');
 */