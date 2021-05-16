package com.bytecoder.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//executeUpdate
public class JdbcTask9
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root","root");
	
		PreparedStatement ps=  con.prepareStatement("insert into dbase (name,city,mobileno,college) values (?,?,?,?)");
	
			ps.setString(1,"Deva");
			ps.setString(2,"Biaora");
			ps.setString(3,"9998887");
			ps.setString(4,"Armys");
			ps.executeUpdate();	
			
			ps.setString(1,"Lokesh");
			ps.setString(2,"Shajapur");
			ps.setString(3,"98709877");
			ps.setString(4,"kents");
			ps.executeUpdate();	
			System.out.println("Successfully Save");
		}
	}
