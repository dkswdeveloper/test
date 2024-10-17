package com.thr;
public class DownloaderThread extends Thread
{
	String fileName;
	//alt shift s, O
	public DownloaderThread(String fileName) {
		super();
		this.fileName = fileName;
	}
	public void run()
	{
		for(int i = 1;i<=10; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("downloading : " + fileName);
		}
	}
	
}
