package com.prakharjain.ProducerConsumerDemo;

import java.util.List;

public class Producer implements Runnable {
	
	final int MAX_SIZE = 5;
	List<Integer> sharedList = null;
	private int i = 0;
	
	public Producer(List<Integer> sharedList)
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
				produce(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void produce(int i)throws InterruptedException
	{
		synchronized (sharedList) {
			while(sharedList.size() == MAX_SIZE)
			{
				sharedList.wait();
				System.out.println("Waiting for consuming");
			}
		}
		
		synchronized (sharedList) {
			System.out.println("Added item"+i);
			sharedList.add(i);
			Thread.sleep(500);
			sharedList.notify();
		}
		
	}
}