package com.pacakge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class SortById implements Comparator
{
	public int compare(Object o,Object o2)
	{ 
		Student s1=(Student)o;
		Student s2=(Student)o2;
		return s1.sid-s2.sid;
	}
}

class Student /* implements Comparable */
{
	public int sid;
	public String sname;

	Student(int sid,String sname)
	{
		this.sname=sname;
		this.sid=sid;

	}
	/*
	 * public int compareTo(Object o) { Student s= (Student)o; return
	 * this.sname.compareTo(s.sname); }
	 */

	public String toString()
	{
		return sid+" "+sname;
	}

	public int hashCode()
	{
		return (sid+" "+sname).hashCode();
	}

	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}

}

public class Arraylistt3
{
	public static void main(String[] args) {

		Student s=new Student(101,"Sky");
		Student s1=new Student(401,"Skight");
		Student s2=new Student(201,"Navlakha");
		Student s3=new Student(301,"Patnipura");
		List lst=new ArrayList();
		lst.add(s);
		lst.add(s1);	
		lst.add(s2);
		lst.add(s3);
		System.out.println(lst);
		Collections.sort(lst,new SortById());
		System.out.println(lst);

	}
}
