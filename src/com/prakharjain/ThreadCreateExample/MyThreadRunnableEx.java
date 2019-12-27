package com.prakharjain.ThreadCreateExample;

public class MyThreadRunnableEx implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println("In Child Thread: "+Thread.currentThread());
		}
	}
	
}
