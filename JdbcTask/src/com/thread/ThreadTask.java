package com.thread;
//Thread using implementing runnabale interface

class Thread1 implements Runnable
{


	public void run() 
	{
		for(int i=1;i<5;i++)
		{
			try {
				System.out.println(i);
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
public class ThreadTask 
{
	public static void main(String[] args) 
	{
        Thread1 t=new Thread1();
        Thread th=new Thread(t);
           th.start();
	}
}
