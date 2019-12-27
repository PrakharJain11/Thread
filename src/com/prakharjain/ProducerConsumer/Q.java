package com.prakharjain.ProducerConsumer;

public class Q {
	
	int num;
	boolean valueSet = false;
	
	public synchronized void put(int num)
	{
		while(valueSet)
		{
			try 
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		this.num = num;
		valueSet = true;
		System.out.println("Put:"+num);
		notify();
	}
	
	public synchronized void get()
	{
		while(!valueSet)
		{
			try 
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Get:"+num);
		valueSet = false;
		notify();
		
	}
}
