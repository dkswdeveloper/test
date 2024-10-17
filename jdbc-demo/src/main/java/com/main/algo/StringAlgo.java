package com.main.algo;

public class StringAlgo
{
	// normal execution
	// boundary value execution
	// exceptional conditions 
	public String shift2Chars(String str)
	{
		// hello -> llohe
		// program -> ogrampr
		// java -> vaja
		String start = str.substring(0,2);
		String end  = str.substring(2);
		return end + start;
	}
	public static void main(String[] args)
	{
		StringAlgo algo = new StringAlgo();
		System.out.println(algo.shift2Chars("Hello"));
		System.out.println(algo.shift2Chars("ab"));
	}

}
