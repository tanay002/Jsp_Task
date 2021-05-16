package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcStoreProcedure_Delete9
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			CallableStatement st=con.prepareCall("{CALL spDelete(13)}");
			st.executeUpdate();
	}
}

/*
 * 
 * DELIMITER $$ 
 * CREATE PROCEDURE spDelete(Eid INT) 
 * BEGIN 
 * DELETE FROM dbase WHERE id=Eid; 
 * END $$
 * 
 * CALL spDelete(12);
 */