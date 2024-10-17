package com.coll;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Pair<F,S>
{
	private final F first;
	private final S second;
	public Pair(F first, S second) {
		super();
		this.first = first;
		this.second = second;
	}
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	public F getFirst() {
		return first;
	}
	public S getSecond() {
		return second;
	}
	
}
public class MapDemo {
	public static void main(String[] args) {
		Pair<String,String> pair = new Pair("Dhruv", "Yashpal");
		Pair<Integer, Integer> pair2 = new Pair(45,67);
		
		
		Map<String, Integer> map  = new HashMap<>();
		map.put("Pawan", 80);
		map.put("Ansal", 70);		map.put("Mohit", 85);
		map.put("Ankita", 95);		map.put("Taruna", 80);
		map.put("Ekta", 84);		System.out.println(map);
		
		map.put("Ekta", 93); //replace prev
		System.out.println(map);
		
		Integer integer = map.get("Pawan");
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		String string = "this is a string";
		//find the freq of each character in string
		
		String fullHashMap = map.toString();
		Set<String> keySet2 = map.keySet(); //control+2, L
		for(String key : keySet2)
		{
			Integer value = map.get(key);
			System.out.println("key=" + key + ", value=" + value);
		}
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet)
		{
			System.out.println("entry= " + entry.getKey() + ":" + entry.getValue());
		}
		map.forEach((key,value) ->{} );
		
	}

}
