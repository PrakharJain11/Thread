package com.prakharjain.ProducerConsumer;

public class Producer implements Runnable {
	
	Q q;
	public Producer(Q q)
	{
		this.q = q;
		Thread t =  new Thread(this,"Producer");
		t.start();
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		} 
	}

}
