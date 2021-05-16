package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcStoreProcedure_Insert5 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		CallableStatement st=con.prepareCall("{call spInsert('yash','kolkata',88780,'RGPV')}");
		int row=st.executeUpdate();
		System.out.println(row);
	}
}

/*
 * DELIMITER $$ CREATE PROCEDURE spInsert(Ename VARCHAR(10),Ecity
 * VARCHAR(10),Emobileno INT,Ecollege VARCHAR(10)) BEGIN INSERT INTO dbase
 * (NAME,city,mobileno,college) VALUES (Ename,Ecity,Emobileno,Ecollege); END $$
 * 
 * CALL spInsert('Tnn','indore',990,'iit');
 */