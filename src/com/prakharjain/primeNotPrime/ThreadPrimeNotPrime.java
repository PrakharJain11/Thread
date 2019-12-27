package com.prakharjain.primeNotPrime;

public class ThreadPrimeNotPrime {
	
	public static void main(String args[])
	{
		new Prime().start();
		new NotPrime().start();
	}
}
