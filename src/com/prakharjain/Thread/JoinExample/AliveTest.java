package com.prakharjain.Thread.JoinExample;

public class AliveTest {
	
	public static void main(String[] args)
	{
		JoinExampleWithAlive jewa = new JoinExampleWithAlive();
		JoinExampleWithAlive jewa1 = new JoinExampleWithAlive();
		jewa.start();
		jewa1.start();
		
		try {
			jewa.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Status main: "+jewa.isAlive());
		System.out.println("Status main1: "+jewa1.isAlive());
	}
}
