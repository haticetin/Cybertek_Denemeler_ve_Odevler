package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(left2(sc.nextLine()));
		
	}
	
	public static String left2(String str) {
		 
		if(str.length()<2) {
			return "Invalid String!";
		}
		
		return str.substring(2).concat(str.substring(0, 2));
	}

}
