package com.fil.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDataMap
{
	public static Map<String, List<String>> map = new HashMap<>();
	static
	{
		map.put("ekta", List.of("DBMS", "JAVA", "OOPS", "OS"));
		map.put("pawan", List.of("spring", "jpa", "javascript"));
		map.put("ashu",List.of("javascript", "logic", "design pattern"));
	}
	

}
