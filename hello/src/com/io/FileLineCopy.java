package com.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileLineCopy {
	public static void main(String[] args) throws FileNotFoundException {
		// read a file line by line
		FileOutputStream fout =new FileOutputStream("sum.txt");
		try(FileReader fr =new FileReader("mynumbers.txt"))
		{
			//FIS -> ISR -> BR
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int i = 1;
			while(line != null)
			{
				System.out.println(i++ + ":" + line);
				int s = sum(line);
				fout.write((""+s + "\n").getBytes());
				line = br.readLine();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	private static int sum(String line) {
		String[] words = line.split("\\s+");
		int s =0;
		for(String word : words)
		{
			int x = 0;
			try
			{
				x = Integer.parseInt(word);
			}
			catch(Exception e) { }
			s += x;
		}
		return s;
	}

}
