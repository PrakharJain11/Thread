package com.prakharjain.RunnableEx;

public class Hello implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("Hi");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
