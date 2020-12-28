package Assignments.Assignment10;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = sc.next();
		
		System.out.print("Enter a separator: ");
		String sep = sc.next();
		
		System.out.print("Enter a counter: ");
		int counter = sc.nextInt();
		
		System.out.println(newStr(word, sep, counter));
		
	}
	
	public static String newStr(String word, String sep, int counter) {
		
		String newStr = "";
		
		for(int i=0; i<counter; i++) {
			newStr += word + sep;
		}
		
		newStr = newStr.substring(0, newStr.length()-sep.length());
		
		return newStr;
	}

}
