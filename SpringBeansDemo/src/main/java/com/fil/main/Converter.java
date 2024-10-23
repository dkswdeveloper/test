package com.fil.main;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter
{
	@PostConstruct
	public void postConstructAction()
	{
		System.out.println("this method will be called after construction");
		System.out.println("and dependencies are also injected");
	}
	@PreDestroy
	public void preDestroy()
	{
		System.out.println("called when object is removed ");
	}
	
//	@Autowired //on property
	private MyStk stk;

//	@Autowired //on contructor
	public Converter(MyStk stk)
	{
		super();
		this.stk = stk;
	}
	
	public MyStk getStk()
	{
		return stk;
	}

	@Autowired //setter injection
	public void setStk(MyStk stk)
	{
		this.stk = stk;
	}

	public void convert()
	{
		System.out.println("value of stk = " + stk);
	}
	
	

}
