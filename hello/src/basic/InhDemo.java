package basic;

public class InhDemo {
	public static void main(String[] args) {
		MyStudent s1 = new MyStudent();
		MyStudent s2 = new MyStudent(111,"Mohit", "CSE");
		MyStudent st3 = new MyStudent(112, "Anisha", "ECE", 21);
		
		ParttimeStudent ps1 = new ParttimeStudent(new String[] {"mon", "tue"});
		ParttimeStudent p2 = new ParttimeStudent(113, "yashpal", "cse", new String[] {"mon", "tue"});
		ParttimeStudent ps3 = new ParttimeStudent(114, "Roshan", "cse", 22, new String[] {"mon", "tue"});
		p2.show();
		
		s2 = p2; //Y Y YYYYYYY
		System.out.println(s2.name);
		s2.show();
//		s2.days //no 
//		ps1 = st1;  //Y Y YYYY YYYY ERROR 
//		BASE = DERIVED;
//		SUPER = SUB;
//		PARENT = CHILD;
		
	}

}
