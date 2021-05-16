package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcStoreProcedure_Select1
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/apnacafe","root","root");
		CallableStatement cal=null;
   try
   {
	   String SQL = "{call spGetData()}";
	   ResultSet rs= con.prepareCall (SQL).executeQuery();
	   
	 while(rs.next())
	 {
		 System.out.println(rs.getInt("salary")+" "+rs.getString("emp_name"));
	 }
   }
   catch (Exception e) {
	e.printStackTrace();
}
	}
}

/*
 * DELIMITER $$ 
 * CREATE PROCEDURE spGetData() 
 * BEGIN 
 * SELECT * FROM register; 
 * END$$
 * 
 * CALL spGetData();
 */