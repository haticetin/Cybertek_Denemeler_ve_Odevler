package Day_19_String_Manipulation_Part1;

import java.util.Scanner;

public class Task_78 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String word = sc.nextLine();
		
		char letter= 'a';
		String letterA="";
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==letter) {
				letterA+=word.charAt(i);
			}
		}
		System.out.println("Number of " + letter + " in this string: " + letterA.length());
	}

}
