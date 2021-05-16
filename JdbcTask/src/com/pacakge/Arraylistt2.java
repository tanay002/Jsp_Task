package com.pacakge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistt2
{
	public static void main(String[] args) {
		List lst=new ArrayList();
	lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);

		ListIterator ls=lst.listIterator();
		
		System.out.println("1st");
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
		
		System.out.println("2nd");
		while(ls.hasNext())
		{
			System.out.println(ls.next());
		}

		
		System.out.println("3rd");
		while(ls.hasPrevious())
		{
			System.out.println(ls.previous());
		}
	}
}
