package Day_18_Reading_User_Input;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide a sentence and I will repeat it: ");
		
//		String str = sc.next();			// String without space
//										// Output OK => all char except space
//		System.out.println(str);		// String + Space => 1st word printed
		
		String str2 = sc.nextLine();	// String + space	
		
		System.out.println(str2);
	}

}
