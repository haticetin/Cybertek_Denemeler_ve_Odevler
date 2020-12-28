package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(doubleChar(sc.nextLine()));
		
	}
	
	public static String doubleChar(String str) {
		String newstr = "";
		
		for(int i=0; i<=str.length()-1; i++) {
			newstr += str.substring(i, i+1).concat(str.substring(i, i+1));
		}
		
		return newstr;
	}

}
