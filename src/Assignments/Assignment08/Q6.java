package Assignments.Assignment08;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");

		next3(sc.nextInt());
		
	}
	
	public static int next3(int num) {
		
		System.out.print("Next 3 numbers are: ");
		
		System.out.println(++num + " " + ++num + " " + ++num);
		
		return num;
		
	}

}
