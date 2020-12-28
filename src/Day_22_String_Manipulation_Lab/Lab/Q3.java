package Day_22_String_Manipulation_Lab.Lab;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
		
		System.out.print("Word: ");
		
		String str = sc.nextLine();
		
		System.out.println(extraEnd(str));
	
	}
	
	public static String extraEnd(String str) {
		
		if(str.length()>=2) {
			str = str.substring(str.length()-2);
			str += str + str;
		}else {
			str = "Word should be at least 2 characters!";
		}
		
		return str;
	
	}

}
