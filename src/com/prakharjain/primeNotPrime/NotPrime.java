package com.prakharjain.primeNotPrime;

public class NotPrime extends Thread {
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==4||i==6||i==8||i==9||i==10)
				{
					System.out.println ("Non-Prime No.= "+i);
				}
				Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
