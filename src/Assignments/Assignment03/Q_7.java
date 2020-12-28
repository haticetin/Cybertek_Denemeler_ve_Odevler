package Assignments.Assignment03;

public class Q_7 {

	public static void main(String[] args) {

				
		int payInCents=100, priceInCents=35, quarters, dimes, nickels, change1, change2, change3;
		change1=payInCents-priceInCents;
		quarters=change1/25;
		change2=change1%25;
		dimes=change2/10;
		change3=change2%10;
		nickels=change3/5;
		
		System.out.println("Price In Cents: " + priceInCents);
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels");

	}

}
