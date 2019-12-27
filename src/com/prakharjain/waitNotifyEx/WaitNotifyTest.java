package com.prakharjain.waitNotifyEx;

public class WaitNotifyTest {
	public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        Thread t1 = new Thread(waiter);
        
        //t1.start();
        new Thread(waiter,"waiter").start();
        
        Waiter waiter1 = new Waiter(msg);
        //new Thread(waiter1, "waiter1").start();
        
        
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }
}
