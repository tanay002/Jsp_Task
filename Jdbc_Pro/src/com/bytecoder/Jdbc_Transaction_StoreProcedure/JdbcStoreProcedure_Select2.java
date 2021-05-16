package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcStoreProcedure_Select2 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		CallableStatement st= con.prepareCall("{call getDataBased(919)}");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("city"));

		}
	}
}


/*DELIMITER $$
CREATE PROCEDURE getDataBased(eid INT)
BEGIN 
SELECT * FROM dbase WHERE id=eid;
END $$

CALL getDataBased(1);*/