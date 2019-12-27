package com.prakharjain.Thread.SleepEx;

public class SleepExample extends Thread{
	
	public void run()
	{
		for(int i =0; i<5; i++)
		{
			//System.out.println(i);
			System.out.println("Thread Name:" +Thread.currentThread().getName());
			//System.out.println("Thread Priority:" +Thread.currentThread().getPriority());
			if(i%2!=0)
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
	

	
	public static void main(String[] args)
	{
		SleepExample t1 = new SleepExample();
		SleepExampleThread t2 = new SleepExampleThread();
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread"+Thread.currentThread().getName());
		System.out.println("Main Thread"+Thread.currentThread().getPriority());
		System.out.println("Main Thread"+Thread.currentThread().getThreadGroup());
	}

}
