package com.main;

import org.apache.log4j.Logger;

public class MainLogging
{
	private static Logger logger = Logger.getRootLogger();
	private static Logger logger2 = Logger.getLogger("com.dk");
	private static Logger logger3 = Logger.getLogger(MainLogging.class.getName());

	public static void main(String[] args)
	{
		logger2.info("new logger with name created");
		logger.debug("Main started");
		int[] a = { 34,67,5,543,67,8,7,654,34,567,896,54};
		bubbleSort(a);
		
		
		logger.trace("value of i = 5");
		logger.debug("method started with args");
		logger.info("for user: library loaded, game started");
		logger.warn("no connection pool, starting with default");
		logger.error("in catch , with full details of input and other ");
		logger.fatal("fatal error");
		
	}

	private static void bubbleSort(int[] a)
	{
		try
		{
			logger.debug("bubbleSort started");
			if(a.length == 0) 
			{
				logger.warn("Might be error as array len = 0");
				return;
			}
			for(int i = 0; i<a.length; i++)
			{
				logger.trace("a[i]=" + a[i]);
			}
		}
		catch(Exception e)
		{
			logger.error(e);
		}


	}

}
