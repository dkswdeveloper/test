package basic;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] marks = { 234,45,65,56,65,34,56,76,543};
		int sum = 0;
		// Server : SonarQube (static code analysis)
		// Sonarlint : plugin warning 
		for(int x: marks)
		{
			sum = sum + x;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		MyStudent s1 =new MyStudent();
		s1.roll = 111; s1.name = "Harshit"; 
		s1.branch = "ECE"; s1.age = 22;
		MyStudent s2 = new MyStudent(123, "Aditya", "CSE", 23);
		
		MyStudent olderStudent = s1.older(s2);
		System.out.println("older = " + olderStudent.name);
		
		
		
		s1.show(); // control : hyperlink back by alt <-
		s2.show();
		s1 = s2; // changes the references
		int[] ar  =new int[5];
		ar[0] = 23; ar[1] = 98;
		
		System.out.println(ar.length);
		System.out.println(Arrays.toString(ar));
		ar = Arrays.copyOf(ar, 7);
		System.out.println(Arrays.toString(ar));
		change(ar);
		Scanner sc = new Scanner(System.in);
		// I/O are open to start with : System.in, System.out,
//		System.err 
		System.out.println("enter the size");
		int x = sc.nextInt();
		int[] br  = new int[x];
		
		
	}

	private static void change(int[] ar) {
		ar = new int[10];		
	}
	

}
