package com.thr;
// wait and notify 
class Printer
{
	 synchronized public static void print(String msg) throws InterruptedException
	{
		System.out.print("[");
		Thread.sleep(2000); //current thread will sleep
		System.out.print(msg);
		System.out.print("]");
	}
	 public void print(int start, int end)
	{
		for(int i = start; i< end ; i++)
		{
			System.out.print(i + ",");
		}
		System.out.println();
	}
}
class PrintThread extends Thread
{
	Printer printer;
	String msg;
	public PrintThread(Printer printer, String msg) {
		super();
		this.printer = printer;
		this.msg = msg;
	}
	@Override
	public void run()
	{
		try {
//			synchronized(printer)
			{
				printer.print(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class SynchDemo {
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		PrintThread t1 = new PrintThread(printer, "Java");
		PrintThread t2 = new PrintThread(printer,"DBMS");
		
		t1.start();
		t2.start();
		
	}

}
