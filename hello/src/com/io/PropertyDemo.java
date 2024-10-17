package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

public class PropertyDemo {
	public static void main(String[] args) throws IOException {
		Random rand = new Random();
		int val = rand.nextInt(10000);
		String otp = "";
		if(val < 10) otp = "000" + val;
		else if(val<100) otp = "00" + val;
		else if (val < 1000) otp = "0" + val;
		else otp = ""+ val;
		System.out.println(otp);
		
		//program to read from properties file and get all values
		FileReader fr  = new FileReader("otp.cfg.properties");
		BufferedReader br = new BufferedReader(fr);
		
		Properties props = new Properties();
		props.load(br);
		
		System.out.println(props);
		int length = Integer.parseInt(props.get("otp.length").toString());
		for(int i = 1; i<=length; i++) 
		{
			System.out.println("geenrting otp of length round " + i);
		}
		
		
//		String line = br.readLine();
//		Map<String,String> map = new HashMap<>();
//		while(line != null)
//		{
//			String[] prop = line.split("=");
//			map.put(prop[0].trim(), prop[1].trim());	
//			line = br.readLine();
//		}
//		System.out.println(map);
		
	}

}
