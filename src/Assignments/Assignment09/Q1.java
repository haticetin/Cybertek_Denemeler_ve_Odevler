package Assignments.Assignment09;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Split or No split (Yes-true,No-false) : ");
		boolean isSplit = sc.nextBoolean();
		
		System.out.print("Number of people entered : ");
		int numberPeople = sc.nextInt();
		
		System.out.print("Check amount : $");
		double checkAmount = sc.nextDouble();
		
		System.out.print("Service Quality : ");
		String serviceQuality = sc.next();

		tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality);
		
	}
	
	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {		
			
			double totalToPay = checkAmount + totalTip(checkAmount,serviceQuality);
			double totalPerPerson = totalToPay/numberPeople;
			double tipPerPerson = totalTip(checkAmount,serviceQuality)/numberPeople;
			
			System.out.println("Number of people entered : "  + numberPeople);
			System.out.println("Total to pay : $" + Math.round(totalToPay*100.0)/100.0);
			System.out.println("Total tip : $" + Math.round(totalTip(checkAmount,serviceQuality)*100.0)/100.0);
			System.out.println("Total per person : $" + Math.round(totalPerPerson*100.0)/100.0);
			System.out.println("Tip per person : $" + Math.round(tipPerPerson*100.0)/100.0);
				
	}
	
	public static double totalTip(double checkAmount, String serviceQuality) {
		
		double totalTip=0;
		
		switch(serviceQuality) {
		case "Poor":
			totalTip = checkAmount*0.05;
			break;
		case "Fair":
			totalTip = checkAmount*0.10;
			break;
		case "Good":
			totalTip = checkAmount*0.15;
			break;
		case "Great":
			totalTip = checkAmount*0.20;
			break;
		case "Excellent":
			totalTip = checkAmount*0.25;
			break;
		
		}
		
		return totalTip;
	}
	
	

}
