package com.pacakge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylistt1 
{
	public static void main(String[] args) {
		List lst=new ArrayList();
	lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
//boolean b=	lst.isEmpty();
//System.out.println(b);
		Iterator it=lst.iterator();
		//it.remove();//illegalStateException
		lst.add(25); //CME
		//it=lst.iterator();
          // lst.remove(0); CME
	while(it.hasNext()) 
		{	
		System.out.println(it.next());
		//lst.remove(2);//CTE
			//System.out.println(it.next()); 
			//lst.remove(2);//CTE
		//	it.remove();
		}

	}
}
