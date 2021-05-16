package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcStoreProcedure_Update8
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String name,city,college;
		int mobileno,id;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		con.setAutoCommit(false);
		CallableStatement st=null;
		System.out.println("Enter no to update data");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter your id");
		System.out.println("Enter new (name city mobileno college) ");
		for(int i=0;i<size;i++)
		{  
			id=sc.nextInt();
			name= sc.next();
			city=sc.next();
			mobileno=sc.nextInt();
			college=sc.next();
			st=con.prepareCall("{call spUpdate('"+name+"','"+city+"','"+mobileno+"','"+college+"','"+id+"')}");
			st.executeUpdate();

		}
		con.commit();

	}
}

/*
 * DELIMITER $$ 
 * CREATE PROCEDURE spUpdate(Ename VARCHAR(10),Ecity VARCHAR(10),Emobileno INT,Ecollege VARCHAR(10),Eid INT) 
 * BEGIN 
 * UPDATE dbase SET NAME=Ename,city=Ecity,mobileno=Emobileno,college=Ecollege WHERE id=Eid;
 * END $$
 * 
 * CALL spUpdate('Rakx','indore',9908872,'sps',11);
 */