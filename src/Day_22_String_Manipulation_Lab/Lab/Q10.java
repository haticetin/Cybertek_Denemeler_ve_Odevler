package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(frontAgain(sc.nextLine()));
		
	}

	public static boolean frontAgain(String str) {
		
		if(str.endsWith(str.substring(0, 2))) {
			return true;
		}else {
			return false;
		}
	}
}
