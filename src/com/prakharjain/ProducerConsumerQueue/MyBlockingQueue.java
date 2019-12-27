package com.prakharjain.ProducerConsumerQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {
	
	private Queue<E> queue;
	private int max = 16;
	private ReentrantLock lock = new ReentrantLock(true);
	
	public MyBlockingQueue(int size)
	{
		queue = new LinkedList<>();
		this.max = size;
	}
	
	public void put(E e)
	{
		lock.lock();
		try {
			if(queue.size() == max)
			{
				
			}
				queue.add(e);
		}
		finally
		{
			lock.unlock();
		}
	}
	
	public E take()
	{
		lock.lock();
		try {
		if(queue.size() == 0)
		{
			
		}
		E item = queue.remove();
		return item;
		}
		finally
		{
			lock.unlock();
		}
	}
}
