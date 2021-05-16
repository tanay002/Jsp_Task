package com.pacakge;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection2
{
public static void main(String[] args) {
	CopyOnWriteArrayList cp =new CopyOnWriteArrayList();
	cp.add(10);
	cp.add("xyz");
	cp.add('a');
	
Iterator it=cp.iterator();
  cp.add(95);
            //    it=cp.iterator();
while(it.hasNext())
{
System.out.println(it.next());	
}
}
}
