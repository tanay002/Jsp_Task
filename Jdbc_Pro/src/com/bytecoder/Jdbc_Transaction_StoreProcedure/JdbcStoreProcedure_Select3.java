package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcStoreProcedure_Select3
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		CallableStatement st= con.prepareCall("{call getdataB(1)}");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("mobileno")+" "+rs.getString("city"));	  
		}
	}
}


/*
 * DELIMITER $$ 
 * CREATE PROCEDURE getdataB(eid INT) 
 * BEGIN 
 * SELECT city,mobileno FROM dbase WHERE id=eid; 
 * END $$
 * 
 * CALL getdataB(1);
 */