package com.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	private static void dealWithSet(Set<String> set)
	{
		
	}
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(); // control + shift + O
		TreeSet<String> set2 = new TreeSet<>(); // control + shift + O
		dealWithSet(set2);
		
		System.out.println(set.add("java"));
		System.out.println(set.add("dbms"));
		System.out.println(set.add("spring"));
		System.out.println(set.add("java"));
		System.out.println(set.add("spring"));
		System.out.println(set.add("junit"));
		System.out.println(set.add("maven"));
		System.out.println(set.add("Maven"));
		System.out.println(set);
//		list.get(3);
		
		String string = "this is a string";
		//how many characters were used to create it
		Set<Character> set3 = new HashSet<>();
		for(int i = 0; i<string.length(); i++)
		{
			set3.add(string.charAt(i));
		}
		System.out.println(set3.size());
		List<String> list = new ArrayList<>();
		Object[] array = list.toArray(); //Object[]
		String[] array2 = list.toArray(new String[1]);
		
		List<String> asList = Arrays.asList(array2);
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			String next = iterator.next();
			System.out.println(next);
		}
		
		for(String tech : set)
		{
			System.out.println(tech);
		}
		set.remove("java");
		set.contains("maven");
		
		
	}

}
