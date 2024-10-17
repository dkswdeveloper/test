//package com.inh;
//
//import java.io.File;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//interface IntProvider
//{
//	public int getInt();
//}
//// write a class that implements IntProvider to read int from file
//// wrtie a class that implements IntProviderto read int from kbd
//// wrtie a class that implements IntProviderto provide int by random number
//// java.util.Random java.math.Random 
//
//class FileIntProvider implements IntProvider
//{
//	String fileName;
//	public FileIntProvider(String fileName) {
//		super();
//		this.fileName = fileName;
//	}
//	@Override
//	public int getInt() {
//		try
//		{
//			File f =new File(fileName);
//			Scanner sc = new Scanner(f);
//			return sc.nextInt();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//			return 1;
//		}
//	}
//
//}
//class KbdIntProvider implements IntProvider
//{	@Override
//	public int getInt() {
//	try
//	{
//		Scanner sc = new Scanner(System.in);
//		return sc.nextInt();
//	}
//	catch(Exception e)
//	{
//		System.out.println(e);
//		return 1;
//	}
//}
//
//}
//class RandomIntProvider implements IntProvider
//{	@Override
//	public int getInt() {
//	try
//	{
//		Random random = new Random();
//		return random.nextInt();
//
//	}
//	catch(Exception e)
//	{
//		System.out.println(e);
//		return 1;
//	}
//}
//}
//class Student 
//{
//	int roll;
//	String name;
//	String branch;
//	private static int nextRoll;
//	//	static IntProvider intProvider;
//	public static void startRollWith(IntProvider intProvider)
//	{
//		nextRoll = intProvider.getInt();
//	}
//	public Student(String name, String branch) {
//		super();
//		this.roll = nextRoll++;
//		this.name = name;
//		this.branch = branch;
//	}
//	@Override
//	public String toString() {
//		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + "]";
//	}
//}
//class InterfaceDemo3 
//{
//	public static void main(String[] args) {
//		IntProvider fileP = new FileIntProvider("initStudentRoll.txt");
//		IntProvider kbdP = new KbdIntProvider();
//		IntProvider randP = new RandomIntProvider();
//		
////		Student.startRollWith(fileP);
//		Student.startRollWith(kbdP);
//		Student.startRollWith(randP);
//		
//		
//		
//		Student s1 =new Student("Ankita", "CSE");
//		Student s2 =new Student("Aditya", "CSE");
//		System.out.println(s1);
//		System.out.println(s2);
//	}
//}
//
//interface StringComparator
//{
//	
//	int compare(String s1,String s2); // it returns -ve if s1<s2, +ve if s1>s2, 0 if =
//	public default void sort(String ar[])
//	{
//		for(int i = ar.length - 1; i>=1; i--)
//		{
//			for (int j = 0; j<i; j++)
//			{
//				if(compare(ar[j], ar[j+1]) > 0)
//				{
//					String temp = ar[j]; 
//					ar[j] = ar[j+1];
//					ar[j+1] = ar[j];
//				}
//			}
//		}
//	}
//	public static void sort(String ar[], StringComparator comp)
//	{
//		
//	}
//	public static final int BLACK = 0, WHITE = 1;
//}
//class StringSorter
//{
//	public void sort(String ar[], StringComparator comp)
//	{
//		for(int i = ar.length - 1; i>=1; i--)
//		{
//			for (int j = 0; j<i; j++)
//			{
//				if(ar[j] > ar[j+1])
//				{
//					String temp = ar[j]; 
//					ar[j] = ar[j+1];
//					ar[j+1] = ar[j];
//				}
//			}
//		}
//	}
//}
//class StringAlphabetsComparator implements StringComparator{
//
//	@Override
//	public int compare(String s1, String s2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	public void fun()
//	{
//		System.out.println("hello");
//	}
//	
//}
//public class InterfaceDemo2 
//{
//	public static void main(String[] args) {
//		StringSorter sorter  = new StringSorter();
//		String ar[] = {"Pranjali", "Taruna", "Dhruv", "Aditya", "Pawan"};
//		StringComparator comp = new StringAlphabetsComparator();
//		StringComparator comp = new StringLengthComparator();
//		StringComparator comp = new StringVowelComparator();
//		
//		sorter.sort(ar, comp);
//		System.out.println(Arrays.toString(ar));
//	}
//}
//
//interface Queue
//{
//	public void add(int x); //adds at rear
//	public int remove(); //removes from front
//}
//interface Deque extends Queue
//{
//	public void addAtFront(int x);
//	public int removeFromRear();
//}
//
//
