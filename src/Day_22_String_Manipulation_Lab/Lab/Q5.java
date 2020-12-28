package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("str: ");
		
		String str = sc.nextLine();
		
		System.out.println(firstHalf(str));
		
	}
	
	public static String firstHalf(String str) {
		
		if(str.length()%2==0) {
			str = str.substring(0, str.length()/2);
		}else {
			str = "Not a valid String!";
		}
		
		return str;
	}

}
