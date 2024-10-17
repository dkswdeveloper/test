package hello;
//
//20 Octobe 1991 
//1990 years completed - 1600 = 390 
//3 * 5 = 15 days 
//90    = 90 + 22 leap  = 127 % 7 = 1 
//31 dec 1990 = Monday
//
//1991 
//3 0 3 2 3 2 3 3 2 20 41 + 1 = 42 % 7 = Sunday 
//
//30 Sep 2024 
//2000 
//23 completed + 5 leap 28 % 7 = 0
//3 1 3 2 3 2 3 3 2 = 22 % 7 = 1 


public class Hello {
	public static void main(String[] args) {
		//now is that ok
		System.out.println("hello fidelity");
		System.out.println(); //sysou control + space
		int i= 5;
		int j = 6;
		int max = Math.max(i,j);
		int max2 = Math.max(i,j);
		// delete line control d, 
		// duplicate line alt down
		// local variable control 2 + L 
		// control I : indentation
		// control + shift + O : Organize import
		//		control + / comment

		String string = "hello";
		//		i+j;
		// if else while switch case do while

		byte b = -128; // to 127
		char ch; // 2 bytes unicode,  not ASCII
		short sh = 23; // -32768 to 32767
		long l = 98L; // 8 bytes
		float f = 3.4f; // 8 bytes to 4 bytes loss of data not allowed
		double db = 5.6;
		change(db);
		System.out.println(db);

		// calendar : leap year 
		
	}
	public static double change(double db)
	{
		db = db * 2;
		return db;
	}
	public static int[] splitYears(int year)
	{
		int[] years = new int[3];
		years[0]  = (year/400) * 400;
		years[1] = (year - years[0] )/100 * 100;
		years[2] = year % 100; 
		return years;

	}
	public static boolean leap(int year)
	{
		if(year % 100 ==0 && year %400 == 0 ||
				year%100 != 0 && year%4 == 0)
			return true;
		return false;
	}
	public static int getDay(int day, int month, int year)
	{
		// get parts of the year - 1
		int parts[] = splitYears(year - 1);
		// a,b,c get b/100 * 5 + c + c/4;
		int ans = parts[1]/100 * 5 + parts[2] + parts[2]/4;
		// for mon = 1 to month add days in ans 
		for(int mon = 1; mon <= month-1; mon++)
		{
			ans += daysInMonth(mon, year);
		}
		// add day to ans  
		ans += day;
//		take ans = ans %7 
		// return ans;
		return ans % 7;
	}
	public static boolean isValid(int day, int month, int year)
	{
		return day>= 1 && day <= 31 && month >=1 && month <= 12
				&& year >= 1 && day <= daysInMonth(month,year);
	}
	private static int daysInMonth(int month, int year) {
		int days[] = {0, 31, 28, 31, 30, 31,30,31,31,30,31,30,31};
		if(month == 2) return days[2] + (leap(year)? 1: 0);
		return days[month];
	}


}
