package com.prakharjain.ProducerConsumerDemo;

import java.util.List;

public class Consumer implements Runnable{
	
	List<Integer> sharedList = null;
	private int i = 0;
	
	public Consumer(List<Integer> sharedList)
	{
		super();
		this.sharedList = sharedList;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				consume(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void consume(int i) throws InterruptedException
	{
		synchronized (sharedList) {
			while(sharedList.size() == 0)
			{
				System.out.println("Waiting for produce");
				sharedList.wait();
			}
		}
		
		synchronized (sharedList) {
			while(sharedList.size()>0)
			{
				Thread.sleep(500);
				System.out.println("Consumed Item: "+sharedList.remove(0));
				sharedList.notify();
				
			}
		}
		
		
	}
	
	
	
}
