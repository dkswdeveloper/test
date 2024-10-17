package com.thr;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class MyTask implements Runnable 
{
	@Override 
	public void run()
	{
		for(int i = 1; i<=100; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
class MyCallable implements Callable<Integer>
{
	@Override
	public Integer call() throws Exception {
		Thread.sleep(new Random().nextInt(10)*1000);
		return new Random().nextInt(100);
	}
}
public class ExecuterDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
		MyTask t1 = new MyTask();
		MyTask t2 = new MyTask();
		MyTask t3 = new MyTask();
		MyCallable t4 = new MyCallable();
		MyCallable t5 = new MyCallable();
//		Future<?> submit = newFixedThreadPool.submit(t1);
//		newFixedThreadPool.submit(t2);
//		newFixedThreadPool.submit(t3);
		Future<Integer> future4 = newFixedThreadPool.submit(t4);
		Future<Integer> future5 = newFixedThreadPool.submit(t5);
		
		System.out.println("Values returned");
		Integer randInt1 = future4.get();
		System.out.println("random = " + randInt1);
		Integer randInt2 = future5.get();
		System.out.println("random = " + randInt2);
		
		
		
	}

}
