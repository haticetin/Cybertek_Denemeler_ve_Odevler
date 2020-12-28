package Day_18_Reading_User_Input;

import java.util.Scanner;

public class changeMaker {

	public static void main(String[] args) {
		
		// Enter a whole number from 1-99, and I will find a combination of coins that 
		// equals that amount of change


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the amount : ");
		
		int attempt=3;

		do {
			int keyboard = sc.nextInt();
			
			if(keyboard>=1 && keyboard<=99) {
				changeMaker(keyboard);
				break;
			}else {
				if(attempt==1) {
					System.out.println("Three chances were avilable");
					System.out.println("Sorry, you lost your chance");
					break;
				}else {
					System.out.println("Invalid amount!");
					System.out.print("Try again: ");
					attempt--;
				}
			}
			
		}while(true);
		
	}
	
	public static void changeMaker(int amount) {
			
		System.out.println(amount + " cents in coins can be given as:");
		System.out.println(amount/25 + " quarters");
		System.out.println((amount%25)/10 + " dimes");
		System.out.println(((amount%25)%10)/5 + " nickels");
		System.out.println((((amount%25)%10)%5)/1 + " pennies");
			
		
	}
	
}
