package Day_19_String_Manipulation_Part1;

import java.util.Scanner;

public class Task_75 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your firstname: ");
		
		String firstname = sc.nextLine();
		
		System.out.print("Please enter your lastname: ");
		
		String lastname = sc.next();
		
		System.out.println("Total characters in your first and last name: " + (firstname.length() + lastname.length()));
	}

	
}






























