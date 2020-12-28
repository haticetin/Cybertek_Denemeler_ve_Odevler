package Assignments.Assignment08;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter test case and test: ");
		
		System.out.println(max(sc.nextInt(),sc.nextInt()));
	}

	public static int max(int x, int max) {
		
		if(x>max) {
			return max;
		}else {
			return x;
		}
	}
}
