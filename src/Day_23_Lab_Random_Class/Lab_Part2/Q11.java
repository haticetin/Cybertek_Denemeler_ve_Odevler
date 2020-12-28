package Day_23_Lab_Random_Class.Lab_Part2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String: ");
		
		System.out.println(countHi(sc.nextLine()));
		
	}
	
	public static int countHi(String str) {
		int count=0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.substring(i, i+2).equals("hi")) {
				count++;
			}
			
		}
		
		return count;
	}

}
