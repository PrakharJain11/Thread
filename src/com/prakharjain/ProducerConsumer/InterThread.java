package com.prakharjain.ProducerConsumer;

public class InterThread {
	
	public static void main(String[] args)
	{
		Q q = new Q();
		
		new Producer(q);
		new Consumer(q);
	}
}
 