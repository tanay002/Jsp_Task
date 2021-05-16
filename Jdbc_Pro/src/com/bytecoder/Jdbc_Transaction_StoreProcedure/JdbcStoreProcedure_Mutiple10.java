package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcStoreProcedure_Mutiple10
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			CallableStatement st=con.prepareCall("{CALL spDm(19,'kalku','nanu uni',8,'blu')}");
			st.executeUpdate();
	}
}
/*
 * DELIMITER $$ 
 * CREATE PROCEDURE spUpdate(Ename VARCHAR(10),Ecity VARCHAR(10),Emobileno INT,Ecollege VARCHAR(10),Eid INT) 
 * BEGIN 
 * UPDATE dbase SET NAME=Ename,city=Ecity,mobileno=Emobileno,college=Ecollege WHERE id=Eid;
 * END $$
 * 
 * CALL spUpdate('Rakxx','indore',9908872,'sps',11);
 */