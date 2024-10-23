package com.fil.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringObjectsDemo
{
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
//		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
//		MyAlgo bean = context2.getBean(MyAlgo.class);
//		System.out.println(bean);
//		System.out.println(context2.getBean(com.fil.main.MySorting.class));
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		int x = System.in.read();
		context.scan("com.fil.main"); //find all the classes annotated with Component
		System.out.println("after scan");
		System.in.read();
		
//		context.refresh();
//		System.out.println("after refresh");
//		String[] beanNames = context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(beanNames));
//		System.in.read();
//		MyAlgo algo = context.getBean(MyAlgo.class);
//		System.out.println(algo);
//		MyAlgo algo3 = context.getBean(MyAlgo.class);
//		System.out.println(algo3);
//		MyAlgo algo4 = context.getBean(MyAlgo.class);
//		System.out.println(algo4);
//		MathAlgo algo2 = context.getBean(MathAlgo.class);
//		System.out.println(algo2);
//		int max = algo.max(5, 6);
//		System.out.println(max);
//		
//		MySorting sorting = context.getBean(MySorting.class);
//		System.out.println(sorting);
//		
		context.refresh();
		System.out.println("after refresh");
		String[] beanNames2 = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames2));
		
		MyStk stk = context.getBean(MyStk.class);
		stk.push(34);
		stk.pop();
		
		MySorting bean = context.getBean(MySorting.class);
		System.out.println(bean);
		
		
	}

}
