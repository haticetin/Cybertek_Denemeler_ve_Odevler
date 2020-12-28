package Day_18_Reading_User_Input;

import java.util.Scanner;

public class Task_73 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Guess a number between 1-20 : ");
		
		int secretNumber=4;
		
		while(true) {
			
			int userInput = sc.nextInt();
			
			if(userInput==secretNumber) {
				System.out.println("Congrats, you got it");
				break;
			}else if(userInput<secretNumber){
				System.out.print("Enter a bigger number: ");
			}else {
				System.out.print("Enter a smaller number: ");
			}
		}
		
		
	}

}
