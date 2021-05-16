package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagement2 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
    Class.forName("com.mysql.jdbc.Driver");
      Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
       Statement s= con.createStatement();
       con.setAutoCommit(false);
    try
    {
       s.execute("insert into dbase (name,city,mobileno,college) values ('kaka','bhopall','990786','iips');");
       s.execute("insert into dbase (name,city,mobileno,college) values ('kaaka','bhopppall','0786','iiiips');");
       con.commit();
       
    }catch (SQLException e)
    {
    	con.rollback();
		e.printStackTrace();
	}  
       
	}
}
