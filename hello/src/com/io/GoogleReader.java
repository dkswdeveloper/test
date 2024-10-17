package com.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GoogleReader {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.google.com");
			InputStream stream = url.openStream();
			int ch = stream.read();
			while(ch != -1)
			{
				ch = stream.read();
				System.out.print((char)ch);
			}
			stream.close();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
