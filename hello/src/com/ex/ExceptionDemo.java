package com.ex;
//abcdefghi
//acegi

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class SmallValueException extends RuntimeException 
{
	SmallValueException() {}
	SmallValueException(String message) { 
		super(message);
	}
}
public class ExceptionDemo {
	public static void main(String[] args) {
		//		Scanner sc = null;
		try (Scanner sc = new Scanner(System.in)) //try with resources
		{
			//			sc = new Scanner(System.in);
			System.out.println("enter 2 integers > 10");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x <= 10 || y <= 10) 
			{
				SmallValueException obj = new SmallValueException("value<10");
//				Exception obj = new Exception("both integers must be > 10");
				throw obj; // error as per my application 
			}
			int z = x/y;
			System.out.println("quotient=" + z);
			int[] ar = new int[5];
			for(int i = 0; i<5; i++)
			{
				System.out.println(ar[i]);
			}
			String s1 = "Hello";
			System.out.println(s1.length());
			String s2 = s1;
			System.out.println(s2.charAt(1));
			//			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("some reference is null " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("some error occured:" + e.getMessage());
		}
		finally
		{
			System.out.println("this code always runs, closing scanner");
			//			sc.close();
		}
		System.out.println("after catch , program continues normally");

	}
	public static void printFile(String fileName) throws Exception
	{
		try
		{
			FileReader fr = new FileReader(fileName);
			int ch = fr.read();
			while(ch != -1)
			{
				System.out.print((char) ch);
				ch  = fr.read();
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			throw e;
		}

	}

}






