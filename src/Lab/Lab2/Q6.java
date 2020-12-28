package Lab.Lab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the amount of the purchase: ");
		
		double purchase = sc.nextDouble();
		System.out.println("Purchase: $" + purchase);
		double stateTax = purchase*(4/(double)100);
		purchase += stateTax;
		double countyTax = purchase*((double)2/100);
		purchase += countyTax;
		double totalTax = stateTax + countyTax;
		
		System.out.println("State tax: $" + stateTax);
		System.out.println("County tax: $" + countyTax);
		System.out.println("Total tax: $" + totalTax);
		System.out.println("Total sale: $" + purchase);
		
	}

}
