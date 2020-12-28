package Assignments.Assignment08;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");

		sign(sc.nextInt());
		
	}
	
	public static int sign(int number) {
		
		if(number>0) {
			System.out.println(1);;
		}else if(number<0) {
			System.out.println(-1);;
		}else {
			System.out.println(0);;
		}
		
		return number;
		
		 
	}

}
