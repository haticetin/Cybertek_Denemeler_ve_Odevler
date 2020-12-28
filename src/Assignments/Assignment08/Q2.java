package Assignments.Assignment08;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		cube();
	}
	
	public static void cube() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		
		int output = input*input*input;
		
		System.out.println(input + "^3 : " + output);
		
		
	}

}
