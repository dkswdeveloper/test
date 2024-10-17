package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) throws IOException {
		try
		(FileOutputStream fout =new FileOutputStream("bindata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fout))
		{
			oos.writeInt(34);
			oos.writeInt(134);
			oos.writeDouble(5.6);
			oos.writeObject("Hello");
			Employee emp1 = new Employee(345, "Ekta");
			oos.writeObject(emp1);
			System.out.println("binary data written");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		(FileInputStream fout =new FileInputStream("bindata.txt");
		ObjectInputStream oos = new ObjectInputStream(fout))
		{
			int x = oos.readInt();
			int y = oos.readInt();
			double db = oos.readDouble();
			Object obj = oos.readObject();
			System.out.println(x + "," + y + ", " + db);
			System.out.println(obj);
			
			Object obj2 = oos.readObject();
			System.out.println(obj2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
