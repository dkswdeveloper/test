package com.main.algo;

import java.util.List;

public class StringAlgoList
{
	List<String> getListAsString(List<Object> list)
	{
		return list.stream().map(ob -> ob.toString()).toList();
	}

}
