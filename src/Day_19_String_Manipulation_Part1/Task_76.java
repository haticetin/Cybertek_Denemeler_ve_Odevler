package Day_19_String_Manipulation_Part1;

import java.util.Scanner;

public class Task_76 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a term: ");
		
		String str = sc.nextLine();
		
		int lastChar = str.length()-1;
		
		for(int i=0; i<=lastChar; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		
		System.out.println();
		
		// Better Solution
		
		for(int i=1; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		
		
		
	}

}
