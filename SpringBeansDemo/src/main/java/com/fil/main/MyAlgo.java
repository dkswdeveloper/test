package com.fil.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//sring will create an object of it 
// every object is having name
// bean = object created by spring
@Component //default Scope : Singleton
//@Scope("prototype") // new object every time
public class MyAlgo
{
	@Autowired
	MyStk stk;
	
	public MyAlgo()
	{
		System.out.println("MyAlgo created");
	}

	int max(int a, int b)
	{
		return a>b?a:b;
	}

}
