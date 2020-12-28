package Lab.Lab2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter charge for the meal: $");
		
		double charge = sc.nextDouble();
		
		double tax = charge*(6.75/100);
		charge += tax;
		double tip = charge*(20.0/100);
		charge += tip;

		System.out.println("Tax amount: " + tax);
		System.out.println("Tip amount: " + tip);
		System.out.println("Total bill: " + charge);
	}

}
