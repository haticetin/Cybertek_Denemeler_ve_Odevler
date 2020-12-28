package Day_19_String_Manipulation_Part1;

import java.util.Scanner;

public class Task_77 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type an emoji: ");
		
		String emoji=sc.next();
		
		if(emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return;		// stop execution of main method
		}				// nothing will be executed after return
		
		char firstChar=emoji.charAt(0);
		char lastChar=emoji.charAt(1);
		
		
		if(firstChar==':') {
			if(lastChar==')') {
				System.out.println("Smile");
			}else if(lastChar=='(') {
				System.out.println("Sad");
			}else if(lastChar=='/') {
				System.out.println("Upset");
			}else if(lastChar=='p') {
				System.out.println("Playful");
			}else {
				System.out.println("Unknown emoji");
			}
		}else if(firstChar==';') {
			if(lastChar==')') {
				System.out.println("Wink");
			}else if(lastChar=='0') {
				System.out.println("Surprised");
			}else {
				System.out.println("Unknown emoji");
			}
		}else {
			System.out.println("Unknown emoji");
		}
	}

}
