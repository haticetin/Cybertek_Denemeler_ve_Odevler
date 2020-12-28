package Lab.Lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a positive number: ");
		int num=sc.nextInt();
		
		if(num>=0) {
			
			int sum=0;
			
			for(int i=1; i<=num; i++) {
				
				sum+=i;
				
			}
			
			System.out.println("Sum: " + sum);
		}else {
			System.out.println("Invalid number");
		}
		
	}


}
