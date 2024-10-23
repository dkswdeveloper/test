package com.fil.main;

import org.springframework.stereotype.Component;

public class MySorting
{
	String sortingType;

	public MySorting(String sortingType)
	{
		super();
		this.sortingType = sortingType;
	}

	@Override
	public String toString()
	{
		return "MySorting [sortingType=" + sortingType + "]";
	}
	

}
