package Assignments.Assignment08;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		System.out.println(isEven(sc.nextInt()));

	}
	
	public static boolean isEven(int number) {
		
		boolean isEven;
		
		if(number%2==0) {
			isEven=true;
		}else {
			isEven=false;
		}
		
		return isEven;
		
		
	}

}
