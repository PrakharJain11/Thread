package com.prakharjain.ThreadPractice;

public class WaitPractice extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Thread t1 = new Thread(new WaitExample());
		Thread t2 = new Thread();*/
		
		WaitExample t = new WaitExample();
		t.start();
		Thread.sleep(10);
		//t1.start();
		
		for(int i=0; i<10; i++)
		{
			Thread.sleep(500);
			System.out.println("Main Thread");
		}
		
		
		//t1.wait();
	}

}
