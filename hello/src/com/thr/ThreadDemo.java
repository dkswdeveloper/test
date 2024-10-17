package com.thr;
class MyThread extends Thread
{
	@Override
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		currentThread.setName("CounterChild-2");
		currentThread.setPriority(1);
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread());
		for(int i = 1; i<= 100; i++)
		{
			
			System.out.println("Thread:" + i);
		}
	}
}
class Algorithm
{
	
}
class MyThread2 extends Algorithm implements Runnable
{
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("CounterChild-1");
		currentThread.setPriority(5);
		System.out.println(Thread.currentThread());
		for(int i = 1; i<= 100; i++)
		{
			System.out.println("Runnable:" + i);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		Thread currentThread = Thread.currentThread();
		currentThread.setName("DBMSMain");
		currentThread.setPriority(9);
		System.out.println(Thread.currentThread());
		MyThread t = new MyThread();
//		t.run(); // runs in background and returns at the moment
		t.start(); //creates new Thread, calls run(), and returns 
		//without waiting for run() to finish
		Runnable obj = new MyThread2();
//		t2.run(); //no multithreading
//		obj.start(); // no start method in MyThread2
		Thread t2 = new Thread(obj);
		t2.start();
		
		for(int i = 1; i<= 100; i++)
		{
			System.out.println("Main :" + i);
		}
	}
}
