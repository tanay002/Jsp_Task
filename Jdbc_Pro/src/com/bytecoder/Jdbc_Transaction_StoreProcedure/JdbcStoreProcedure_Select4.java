package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcStoreProcedure_Select4
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		CallableStatement st= con.prepareCall("{call getDB()}");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("mobileno")+" "+rs.getString("city"));	  
		}
	}
}


/*
DELIMITER $$
CREATE PROCEDURE getDB()
BEGIN 
SELECT city,mobileno FROM dbase;
END $$

CALL getDB();
 */