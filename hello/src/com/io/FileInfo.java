package com.io;

import java.io.File;
import java.util.Arrays;

public class FileInfo {
	
	public static void main(String[] args) {
		File file = new File("src/basic/Box.java");
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		File dir = new File(".");
		System.out.println("current : " + dir.getAbsolutePath());
		String[] list = dir.list();
		System.out.println(Arrays.toString(list));
		//new folder creatin deletion
		//new file creation deletion size
		
		// search a file with given name 
		// current and all subfolders ? 
		
	}

}
