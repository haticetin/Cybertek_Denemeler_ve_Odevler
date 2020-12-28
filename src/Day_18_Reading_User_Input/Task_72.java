package Day_18_Reading_User_Input;

import java.util.Scanner;

public class Task_72 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
				
		int result=0;
		int num=0;
		
		while(num<=2) {
			
			System.out.print("Please enter number " + ++num + " : ");
			
			int keyboard = sc.nextInt();
			
			result+=keyboard;
			
		}
		
		System.out.println("Sum of the numbers = " + result);
		
		
	}

}
