package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String a: ");
		
		String a = sc.nextLine();
		
		System.out.print("String b: ");
		
		String b = sc.nextLine();
		
		System.out.println(comboString(a, b));

		
	}
	
	public static String comboString(String a, String b) {
		
		if(a.length()<b.length()) {
			return a+b+a;
		}else if(a.length()>b.length()) {
			return b+a+b;
		}else {
			return "Invalid";
		}
	}

}
