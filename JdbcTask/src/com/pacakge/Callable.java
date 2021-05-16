package com.pacakge;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Callable 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
Class.forName("com.mysql.jdbc.Driver");

  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/interview","root","root");
		/*
		 * callablestatement
		 * st=con.preparecall("{call interview.getinsertw('rahul',4)}"); int
		 * row=st.executeupdate(); system.out.println(row);
		 *
		 * 
		 */
   /*    Statement st= con.createStatement();
       st.addBatch("insert into customer (cname,dep,salary) value ('Raj','iips',30000)");
       st.addBatch("insert into customer (cname,dep,salary) value ('Raja','iips',40000)");
       st.addBatch("insert into customer (cname,dep,salary) value ('Rajan','iips',50000)");
       int []row=st.executeBatch();
       int k=row.length;
       for(int i=0;i<k;i++)
       {
    	   System.out.println(row[i]);
       }
*/
  //   con.setAutoCommit(false); 
  Statement st= con.createStatement();
  try
  {
	  st.execute("insert into customer(cname,dep) value ('Ramu','ps')");
	  st.execute("insert into customer(cname,dep) value ('Ch','cs')");
//	  con.commit();
  }
   catch (Exception e) {
	   con.rollback();
}  
	
}
}
