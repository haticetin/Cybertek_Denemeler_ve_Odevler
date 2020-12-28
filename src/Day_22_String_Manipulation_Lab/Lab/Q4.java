package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write char or collection of char: ");
		
		String str = sc.nextLine();
		
		System.out.println(firstTwo(str));
	}
	
	public static String firstTwo(String str) {
		
		if(!str.isEmpty() && str.length()>=2) {
			str = str.substring(0, 2);
		}
		
		return str;
		
		
	}

}
