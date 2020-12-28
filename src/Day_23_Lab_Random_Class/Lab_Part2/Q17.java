package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(palindrome(sc.nextLine()));
		
	}
	
	public static boolean palindrome(String str) {
		
		String strBack = "";
			
		for(int i=str.length(); i>0; i--) {
			strBack += str.substring(i-1, i);
		}
		
		str = str.replace(" ","");
		strBack = strBack.replace(" ","");
		
		if(str.equalsIgnoreCase(strBack)) {
			return true;
		}
		
		return false;
		
	}

}
