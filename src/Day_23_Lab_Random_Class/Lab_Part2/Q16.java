package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(atFirst(sc.nextLine()));
	}
	
	public static String atFirst(String str) {
		
		if(str.length()>=2) {
			str = str.substring(0, 2);
		}else {
			str = str.concat("@");
		}
		
		return str;
	}

}
