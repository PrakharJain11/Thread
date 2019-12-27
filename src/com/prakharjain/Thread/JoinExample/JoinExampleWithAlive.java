package com.prakharjain.Thread.JoinExample;

public class JoinExampleWithAlive extends Thread {
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Status: "+isAlive());
		}
		
		System.out.println("Exit from Thread1");
	}
}
