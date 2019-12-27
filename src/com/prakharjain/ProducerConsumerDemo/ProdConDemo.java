package com.prakharjain.ProducerConsumerDemo;

import java.util.ArrayList;
import java.util.List;

public class ProdConDemo {

	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		Thread t1 = new Thread(new Producer(sharedList));
		Thread t2 = new Thread(new Consumer(sharedList));
		
		
		t1.start();
		t2.start();
	
	}

}
