package com.prakharjain.ProducerConsumer;

public class Consumer extends Thread {
	
	Q q;
	
	public Consumer(Q q)
	{
		this.q = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
