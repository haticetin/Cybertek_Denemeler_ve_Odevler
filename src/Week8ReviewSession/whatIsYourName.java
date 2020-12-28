package Week8ReviewSession;

import java.util.Scanner;

public class whatIsYourName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Harris Teeter!");
		System.out.println("How much are potatoes:");
		
		double price1 = sc.nextDouble();
		
		System.out.println("How much are eggplants?");
		double price2 = sc.nextDouble();
		
		double totalPrice = price1 + price2;
		System.out.println("Total: $" + totalPrice);
	}

}
