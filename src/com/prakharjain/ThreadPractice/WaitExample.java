package com.prakharjain.ThreadPractice;

public class WaitExample extends Thread {
		
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Current Thread:"+Thread.currentThread());
		}
	}
}
