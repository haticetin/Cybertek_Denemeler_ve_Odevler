package Day_19_String_Manipulation_Part1;

import java.util.Scanner;

public class Task_79 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String word=sc.nextLine();
		
		String vowelLetters="";
				
		for(int i=0; i<word.length(); i++) {
				if(word.charAt(i)=='a'||word.charAt(i)=='A'||word.charAt(i)=='e'||word.charAt(i)=='E'||word.charAt(i)=='i'||word.charAt(i)=='I'||word.charAt(i)=='o'||word.charAt(i)=='O'||word.charAt(i)=='u'||word.charAt(i)=='U') {
					vowelLetters+=word.charAt(i)+",";
					}
				}
		vowelLetters=vowelLetters.substring(0,vowelLetters.length()-1)+"";
		System.out.println("Vowel letters in " + word + " are: " + vowelLetters);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
