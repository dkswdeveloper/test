package com.str;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 =new String ("Hello");
		String s4 =new String ("Hello");
		String s5 = "He" + "llo";
		String s6 = "He";;
		String s7 = "llo";
		String s8 = s6 + s7;
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s4 == s3);
		System.out.println(s1 == s5);
		System.out.println(s4 == s5);
		System.out.println(s2 == s8);
		System.out.println(s3 == s8);
		System.out.println(s1.equals(s3)); //equals from Object class (overridden in String)
		
		String str = "Hello";
		str.concat("Atul");
		System.out.println(str);
		str.length();
		str.charAt(0);
		System.out.println(str.startsWith("Hel"));
		System.out.println(str.endsWith("Hel"));
		str.contains("ll"); str.contains("java");
		System.out.println(str.indexOf('l'));
		System.out.println(str.lastIndexOf('l'));
		str = "    this     is    a string in    java  ";
		System.out.println(str.trim());
		System.out.println(str.substring(15));
		System.out.println(str.substring(10, 20));
		System.out.println(str.replace("i","II"));
		System.out.println(str.replace(" ","$"));
		
		String names = "Harshit,Ankita, Pranjali, Mohit,Yashpal";
//		String[] split = names.split("[,|\\s]");
		String[] split = names.split("[, |,]+");
		for(String name : split)
			System.out.println(name);
		
		int x = 34;
		String xStr = ""+x;
		String valueOf = String.valueOf(x);
		String val = "234";
		int parseInt = Integer.parseInt(val);
		char[] charArray = str.toCharArray();
		int diff = "apple".compareTo("aptech");
		System.out.println(diff);
		
		
		
	}

}
