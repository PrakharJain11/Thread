package com.prakharjain.ThreadCreateExample;

public class RunnableDemo {
	
	public static void main(String[] args)
	{
		MyThreadRunnableEx runObj = new MyThreadRunnableEx();
		
		Thread t = new Thread(runObj);
		t.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread: "+Thread.currentThread());
		}
	}
	
}
