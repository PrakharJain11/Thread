package com.prakharjain.Thread.SleepEx;

public class SleepExampleThread extends Thread {
	
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			//System.out.println(i);
			System.out.println("Thread Name in 1:" +Thread.currentThread().getName());
			//System.out.println("Thread Priority in 1:" +Thread.currentThread().getPriority());
			//System.out.println("Thread time:"+Thread.currentThread());
			
			if(i%2==0)
			{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
	
}
