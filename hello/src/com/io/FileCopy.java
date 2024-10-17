package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/com/ex/ExceptionDemo.java");
//		FileInputStream fin = new FileInputStream("src\\com\\ex\\ExceptionDemo.java");
		// will create a new file, delete the content if already there
		FileOutputStream fout = new FileOutputStream("ExceptionDemoCopy.java");
		int b = fin.read();
		while(b != -1)
		{
			fout.write(b);
			b = fin.read();
			b = fin.read();
		}
		fin.close();
		System.out.println("file copied");
		fout.close();
			
		
	}

}
