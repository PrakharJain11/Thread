package com.prakharjain.ThreadCreateExample;

public class ThreadDemo {
	
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		
		for(int i =0; i<10; i++)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main Thread: "+Thread.currentThread());
		}
	}
}
