package Assignments.Assignment10;
import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
		
		int product = 1;
		
		for(int i=n; i>0; i--) {
			product *= i;
		}
		
		return product;
	}

}
