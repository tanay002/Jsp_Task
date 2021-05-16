package com.bytecoder.BankScenario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bank 
{
	public void deductMoney(int money,String uname) throws BankException, ClassNotFoundException, SQLException
	{  
		int amt=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select amount from amtdata where uname='"+uname+"';");
		while(rs.next())
		{
			amt=rs.getInt("amount");
		}
		if((amt-money)>0&&(amt%100==0))
		{ 
			amt=amt-money;
			s.executeUpdate("update amtdata set amount='"+amt+"' where uname='"+uname+"';");
			System.out.println("Remaining Balance is "+amt);
		}
		else
			throw  new BankException("Invalid amount");

	}
  
	public void depositeMoney(int amt,String uname) throws ClassNotFoundException, SQLException
	{
		int amount=0;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select amount from amtdata where uname='"+uname+"';");
		while(rs.next())
		{
			amount=rs.getInt("amount");
		}
		if(amt<20000)
		{ 
			amount=amt+amount;
			s.executeUpdate("update amtdata set amount='"+amount+"' where uname='"+uname+"';");
			System.out.println("Reflected Balance is "+amt);
		}
		else
			System.out.println("Can't Deposite more than 20000");
	}
	public static void main(String[] args) throws ClassNotFoundException, BankException, SQLException
	{
		System.out.println("Enter choice \n 1:Withdrwal \n2:Deposite");
		Bank b=new  Bank();
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		switch(c)
		{
		case 1: System.out.println("Enter name and Amount to withdrawl money");
		String s=sc.next();	
		int amt=sc.nextInt();
		b.deductMoney(amt,s);
         break;
		case 2: System.out.println("Enter name and Amount to Deposite money");
		String s1=sc.next();	
		int amt1=sc.nextInt();
		b.depositeMoney(amt1,s1);
		break;
		default: System.out.println("Invalid Case");
		System.exit(1);
		}

	}
}
