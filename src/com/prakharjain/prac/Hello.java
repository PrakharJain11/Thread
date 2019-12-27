package com.prakharjain.prac;

public class Hello implements Runnable {
	
	Message msg = new Message();
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Hello");
			synchronized (msg) {
				System.out.println("Hello11111");
				msg.notify();
				
			}
			/*try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(" In Catch Hello");
			}*/
		}
	}
}
