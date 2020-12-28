package Day_18_Reading_User_Input;

import java.util.Scanner;

public class Task_74 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int userInput;
		int sum=0;
		
		do {
			System.out.print("Enter a number : ");
			
			userInput = sc.nextInt();
			
			sum+=userInput;
			
		}while(userInput>=0);
		
		System.out.println("Sum of the numbers : " + sum);
	}

}
