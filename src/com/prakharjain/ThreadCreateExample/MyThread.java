package com.prakharjain.ThreadCreateExample;

public class MyThread extends Thread {

	public void run()
	{
		for(int i=0; i<10; i++)
		{	
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}
	}
}
