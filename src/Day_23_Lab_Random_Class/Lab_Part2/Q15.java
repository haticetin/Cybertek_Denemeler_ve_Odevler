package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");

		System.out.println(hasBad(sc.nextLine()));
		
	}
	
	public static boolean hasBad(String str) {
		
		if(str.substring(0,3).contains("bad")||str.substring(0,3).contains("Bad")
				||str.substring(1,4).contains("bad")||str.substring(1,4).contains("Bad")) {
			return true;
		}else {
			return false;
		}
	}

}
