package Assignments.Assignment10;

public class Q30 {

	public static void main(String[] args) {


		String s1 = "blabla";
		String s2 = "a";
		
		System.out.println(at3(s1, s2));
		
	}
	
	public static String at3(String s1, String s2) {
		
		s1 = s1.substring(0, 3) + s2 + s1.substring(3, s1.length());
		
		return s1;
	}

}
