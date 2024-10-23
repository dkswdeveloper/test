package com.fil.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class ManualObjects
{
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		MyAlgo obj1 = new MyAlgo();
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the class name ");
		String line = sc.nextLine();
		Class<?> class1 = Class.forName(line);
		Constructor<?>[] constructors = class1.getDeclaredConstructors();
		Object newInstance = constructors[0].newInstance();
		System.out.println(newInstance);
		
		
	}
}
