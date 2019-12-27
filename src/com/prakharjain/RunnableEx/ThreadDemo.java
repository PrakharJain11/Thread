package com.prakharjain.RunnableEx;

public class ThreadDemo {
	public static void main(String[] args)
	{
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
	}
}
