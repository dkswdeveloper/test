package com.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

interface Picture 
{
	public void show(int size);
}
interface Draw
{
	public void draw(int window);
}
class MyPicture implements Picture
{
	@Override
	public void show(int size) {
		System.out.println("Shown with " + size);
	}
}
class Point
{
	double x,y;
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
//		this and p to be compared, with base class ref, only base class is accessible
		Point p = null;
		try {
			p = (Point) obj;
		}
		catch(ClassCastException e) { 
			return false;
		}
//		Point p = null;
//		if(obj instanceof Point)
//		{
//			p = (Point) obj;
//		}
//		if(obj.getClass() == Point.class) {
//			p = (Point) obj;
//		}
		if(this.x == p.x && this.y == p.y)
			return true;
		return false;
	}
}
public class CollectionDemo {
	public static void main(String[] args) {
//		Picture pic = new MyPicture();
//		pic.show(12);
//		Draw draw = (w) -> System.out.println("in a window "+ w) ;
//		Draw draw1 = pic::show;
//		draw1.draw(88); //will call pic.show(88)
		listDemo();

	}

	private static void listDemo() {
		List<Point> points = new ArrayList<>();
		points.add(new Point(1,2));
		points.add(new Point(4,5));
		points.add(new Point(6,7));
		points.add(new Point(1,5));
		points.add(new Point(4,5));
		points.add(new Point(5,5));
		System.out.println(points.contains(new Point(6,7)));
		Point p1 =new Point(3,4);
		boolean equals = p1.equals("Hello");
		System.out.println(equals);
		
		
		
		
//		
//		
//		
//		List<Integer> list = new ArrayList<>();
//		//adds at last
//		list.add(93); // autoboxing 93 to new Integer(93) 
//		list.add(33); list.add(45); list.add(33); list.add(45) ;
//		list.add(53); list.add(50);
//		//print 
//		System.out.println(list);
//		for(int x : list) //with iterator
//		{
//			System.out.println(x);
//		}
//		Iterator<Integer> iterator = list.iterator();
//		while(iterator.hasNext())
//		{
//			Integer next = iterator.next();
//			System.out.println(next);
//		}
//		for(int i = 0; i<list.size(); i++)
//		{
//			Integer integer = list.get(i);
//			System.out.println(integer);
//		}
//
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//
//			} } );
//		list.forEach(t -> System.out.println(t));
//		list.forEach(System.out::println); //Method references
//		System.out.println();
//		list.add(0, 99);
//		System.out.println(list);
//		Integer y = 99;
//		list.remove(y); //error index of the elelement to be deleted
//		System.out.println(list);
//		list.set(0, 990);
//		System.out.println(list);
//		//delete all alternate elements from the list
//		//		12 34 56 34 56 67 5 678 8 65 368
//		//		12 56 56 5 8 368
//		List<Integer> list2 = List.of(12,34,45,56,67,67,788,96,74,43,5,6,89,876);
//		int j = 1;
//		for(Integer x : list2)
//		{
//			if(j++ %2 == 0)
//				list.remove(x);
//		}
//		int i;
//		if(list.size() %2 == 0) i = list.size() -1;
//		else i = list.size() - 2;
//
//
//		String names[] = { "alsdkfj", "woeir", "lkj", " vidi", "slkriotgke"};
//		String longNames[] = longerNames(names, 7);
	}

	private static String[] longerNames(String[] names, int len) {
		String[] longNames = new String[names.length];
		int i = 0; 
		for(String name : names)
		{
			if(name.length() > len)
				longNames[i++] = name;
		}
		return Arrays.copyOf(longNames, i);
	}
	private static List<String> longerNames2(String[] names, int len) {
		//		List<String> longNames = new ArrayList<>();
		List<String> longNames = new LinkedList<String>();
		for(String name : names)
		{
			if(name.length() > len)
				longNames.add(name);
		}
		return longNames;
	}

}















