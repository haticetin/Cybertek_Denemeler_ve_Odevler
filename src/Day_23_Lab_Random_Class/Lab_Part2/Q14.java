package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(endsLy(sc.nextLine()));
		
	}
	
	public static boolean endsLy(String str) {
		
		if(str.length()>2) {
			if(str.substring(str.length()-2).equals("ly")) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
		
	}

}
