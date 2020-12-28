package Day_20_String_Manipulation_Part2;

import java.util.Scanner;

public class Task_80 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please write a sentence:");
		String str1=sc.nextLine();
		System.out.println("Please write a word:");
		String str2=sc.next();
		checkedString(str1, str2);
		
	}
	
	public static void checkedString(String str1, String str2) {
		
			// str1.contains(str2) is also OK
		if(str1.indexOf(str2)>-1) {
			System.out.println("Position of " + str2 + " : " + str1.indexOf(str2));
		}else {
			System.out.println("Not found");
		}
	}

}
