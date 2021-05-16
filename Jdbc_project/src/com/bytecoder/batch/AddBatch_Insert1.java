package com.bytecoder.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch_Insert1 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	Class.forName("com.mysql.jdbc.Driver");
	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
	  Statement s=con.createStatement();
	  s.addBatch("insert into dbase (name,city,mobileno,college) values ('Rajat','rajgarh',99089876,'RCHS');");
	  s.addBatch("insert into dbase (name,city,mobileno,college) values ('Vinay','Up',99021876,'Scsit');");
	  s.addBatch("insert into dbase (name,city,mobileno,college) values ('Anil','Satna',99083276,'scsit');");
	  int row[]=s.executeBatch();
	   
}
}
