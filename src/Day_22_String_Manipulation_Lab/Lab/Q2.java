package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("String a: ");
		String a=sc.nextLine();
		System.out.print("String b: ");
		String b=sc.nextLine();
		
		System.out.println(makeAbba(a, b));
		
	}
	
	public static String makeAbba(String a, String b) {
		
		return a.concat(b).concat(b).concat(a);
		
//		return a + b + b + a;
		
	}

}
