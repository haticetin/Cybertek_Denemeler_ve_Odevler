package Assignments.Assignment08;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		plus();
		
	}
	
	public static void plus() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Result: "  + (num1+num2));
		
		
		
	}

}
