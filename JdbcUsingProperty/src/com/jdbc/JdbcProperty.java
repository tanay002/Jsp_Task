package com.jdbc;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcProperty 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{ 
		Scanner sc=new Scanner(System.in);
		FileReader io=new FileReader("connectivity.properties");

		Properties ps=new Properties();
		ps.load(io);

		System.out.println("Enter Username and Password:-\n");
		String myuname=sc.next();
		String mypassword=sc.next();
		String username = ps.getProperty("username");
		String password = ps.getProperty("password");

		if(myuname.equals(username)&&mypassword.equals(password))
		{
			String driver = ps.getProperty("driver");
			Class.forName(driver) ;
			String url = ps.getProperty("url");
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from dbase;");

			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getString("college"));
			}
		}
	
	else
	{
		System.out.println("Sahi Username and Password dal be...");
	}
		
		Properties p=new Properties();  
		p.setProperty("name","Soda");  
		p.setProperty("email","desio");  
		  
		p.store(new FileWriter("info.properties"),"File Code");  		  
}
}