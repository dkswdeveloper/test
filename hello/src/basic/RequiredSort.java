package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class RequiredSort {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		Date date = format.parse("12/09/12");
		Date date2 = format.parse("12/10/12");
		System.out.println(date.after(date2));
		System.out.println(date.before(date2));
		
		System.out.println(date);
		String[] names = { "a", "b", "lkj", "cir", "rec", "java", "hello"};
		int values[] = { 23,   5,     45,	34,		67,		43,		97};
		// 5, 45, 23, 97, 
		String req[] = {  "b", "lkj", "a", "hello", "cir", "rec", "java"};
		//sort the array values as per the names req order
		sort(names, values, req);
		System.out.println(Arrays.toString(values));
		
	}

	private static void sort(String[] names, int[] values, String[] req) {
		// TODO Auto-generated method stub
		
	}

}
