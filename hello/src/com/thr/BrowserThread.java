package com.thr;

import java.util.ArrayList;
import java.util.List;

public class BrowserThread {
	public static void main(String[] args) throws InterruptedException {
		String[] fileNames = {"1.txt", "2.txt", "3.txt",
				"4.txt", "5.txt", "6.txt",
				"7.txt", "8.txt", "9.txt", "10.txt"};
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		List<Thread> list = new ArrayList<>();
		for(int i = 0; i< fileNames.length; i++)
		{
			DownloaderThread t = new DownloaderThread(fileNames[i]);
			t.start();
			list.add(t);
		}
//		Thread t = new Thread();
//		t.join(); //block and wait for thread to finish
		for(Thread t : list)
		{
			System.out.println("main thread waiting");
			t.join();
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2);
		System.out.println("time taken = " + (time2 - time1));
		
		Thread mainThread = Thread.currentThread();
		System.out.println("main thread waiting for main to finish");
		mainThread.join();
	}

}

//1 2 3 4 5
//1 2 3 4 5
//2 3 4 5 6
//5 6 7 8 9
//1 2 3 4 5 
//
//
//1 2 3 4 5
//1 2 3 4 5
//2 3 4 5 6
//5 6 7 8 9
//1 2 3 4 5 
//
//
//Add 

//File dir =new File("path");
//File[] files = dir.listFiles();
//Search for files ".java" and count the number of times a word comes
//and update it in a map
//multithreading for each file to search the count and update the map















