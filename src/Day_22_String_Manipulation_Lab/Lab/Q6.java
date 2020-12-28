package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		String str = sc.nextLine();
		
		System.out.println(withoutEnd(str));

		
	}
	
	public static String withoutEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String!";
		}
		
		return str.substring(1, str.length()-1);
	}

}
