package Assignments.Assignment08;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");

		fib(sc.nextInt());
	}
	
	public static void fib(int num) {
		
		int preNum=0;
		int nextNum=1;
		int sum;
		
		for(int i=0; i<=num; i++) {
			
			if(i==num) {
				if(num==1) {
					System.out.print("First Fibonacci number: " + preNum);
				}else if(num==2) {
					System.out.print("Second Fibonacci number: " + preNum);
				}else if(num==3) {
					System.out.print("Third Fibonacci number: " + preNum);
				}else {
					System.out.print(num + "th Fibonacci number: " + preNum);
				}
			}
			
			sum=preNum+nextNum;
			preNum=nextNum;
			nextNum=sum;
			
			
		}
		
		
	}

}
