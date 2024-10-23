package com.fil.main;

import org.springframework.stereotype.Component;

@Component
public class MyStkImpl implements MyStk
{
	@Override
	public void push(int x)
	{
		System.out.println("push " + x);
	}
	@Override
	public int pop()
	{
		System.out.println("pop out");
		return 0;
	}
}
