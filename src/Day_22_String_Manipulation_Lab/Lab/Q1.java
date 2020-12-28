package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		
		System.out.println(helloName(sc.nextLine()));
		
	}
	
	public static String helloName(String name) {
		
		String greeting = "Hello ";
		
		greeting = greeting.concat(name).concat("!");
		return greeting;
		
		
//		return "Hello ".concat(name).concat("!");		
		
		// can be done like this too
	}

}
