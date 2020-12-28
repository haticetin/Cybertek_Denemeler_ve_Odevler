package Day_33_ClassObjects_constructors;

import java.util.Scanner;

public class BankAccount_Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input;
		
		System.out.println("What is your starting balance?");
		
		input = sc.next();
		
		BankAccount account1 = new BankAccount(input);
		
		System.out.println("How much were you paid this month?");
		
		input = sc.next();
		
		account1.deposit(input);
		
		System.out.println("Your pay has been deposited. Your current balance is: " + account1.getBalance());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
