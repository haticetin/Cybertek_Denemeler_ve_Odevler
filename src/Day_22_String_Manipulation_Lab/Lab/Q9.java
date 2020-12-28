package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(right2(sc.nextLine()));

		
	}
	
	public static String right2(String str) {
		
		if(str.length()<2) {
			return "Invalid String!";
		}
		
		return str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
	}

}
