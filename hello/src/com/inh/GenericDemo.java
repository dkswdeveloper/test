package com.inh;

import java.util.function.Function;

import javax.management.RuntimeErrorException;
// create a class Pair (generic) where both data memebers 
//are private . Add getter setter for the data members
class Pair<F, S>
{
	private F first;
	private S second;
	public Pair(F first, S second) {
		super();
		this.first = first;
		this.second = second;
	}
	public F getFirst() {
		return first;
	}
	public void setFirst(F first) {
		this.first = first;
	}
	public S getSecond() {
		return second;
	}
	public void setSecond(S second) {
		this.second = second;
	}
	public static Pair getRandomPair ()
	{
		return new Pair(45,45);
	}
	public Pair<F,S> getPair()
	{
		return this;
	}
	
}
class UnderflowException extends Exception 
{
	
}
class OverflowException extends Exception
{
	OverflowException() {}
	OverflowException(String message) { super(message); }
}
class MyStk <T> 
{
	Object ar[] = new Object[10];
	int top = -1;
	
	
	public void push(T x) throws OverflowException
	{
		if(top == ar.length -1)
		{
			throw new OverflowException("overflow with stack size=" + ar.length);
		}
		ar[++top] = x;
	}
	public T pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow");
			return null;
		}
		return (T) ar[top--];
	}
}


public class GenericDemo {
	public static void main(String[] args) throws UnderflowException,OverflowException
	{
		try {
			fun1();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Function<String,Integer> fun ;
		
		MyStk<Integer> stk = new MyStk<>(); // primitative data types not allowed
		MyStk<String> stk2 = new MyStk<>();
		stk2.push("Hello");
		stk.push(3);
		
		
		
		// int char float boolean short double char float byte long
		// Integer Character Boolean Short Double Float Byte Long (Wrapper class)
		int x = 6; //default value of x = 0
		Integer y = 16; //default value = null
		x = y; //auto unboxing
		y = x; // auto boxing
		System.out.println("program completes");
	}

	private static void fun1() {
		fun2();
	}

	private static void fun2() {
		fun3();
	}

	private static void fun3() {
		throw new RuntimeException("some error");
		
	}
}









