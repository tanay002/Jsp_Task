package com.bytecoder.Jdbc_Transaction_StoreProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcStoreProcedure_ThreeQuery11
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			CallableStatement st=con.prepareCall("CALL spMultiple3(20,'Rakx','dpss',19,'bluedart')");
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getString("college"));
			}
	}
}
/*
DELIMITER $$
CREATE PROCEDURE spMultiple3(ecid INT,ename VARCHAR(15),college VARCHAR(15),eeid INT,eUdata VARCHAR(13))
BEGIN
INSERT INTO edata VALUES (ecid,ename,college);
UPDATE edata SET ename=eUdata WHERE eid=eeid;
SELECT *FROM edata;
END $$

CALL spMultiple3(19,'kalku','nanu uni',8,'blu');
Show procedure status;

 */