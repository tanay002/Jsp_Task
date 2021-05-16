package com.pacakge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetPro
{
	public static void main(String[] args) {
		
		Student s=new Student(401,"xyz");
		Student s1=new Student(201,"xyz");
		Student s2=new Student(201,"xyz");
		Student s3=new Student(301,"xyz");
		
		Set sd=new HashSet();
		
		sd.add(s);
		sd.add(s1);
		sd.add(s2);
		sd.add(s3);
		
		System.out.println(sd);
	}
}
