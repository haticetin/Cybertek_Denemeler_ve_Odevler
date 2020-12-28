package Assignments.Assignment09;

import java.util.Scanner;

public class Q14 {
	
	static Q14_Class insurancePremium = new Q14_Class();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double premium = 0;
				
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Do you have a US driver license?");
		String hasDriverLicense = sc.next();
		
		if(hasDriverLicense.equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		System.out.println("Enter your zip code: ");
		int zipCode = sc.nextInt();
		premium = insurancePremium.zipcode(zipCode);
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		String carOwnership = sc.next();
		premium = insurancePremium.carOwnership(carOwnership);
		
		System.out.println("How is this vehicle primarily used?");
		String carUsage = sc.next();
		premium = insurancePremium.carUsage(carUsage);
		
		System.out.println("Days Driven To Work And/Or School: ");
		int daysDriven = sc.nextInt();
		premium = insurancePremium.daysDriven(daysDriven);
		
		System.out.println("Miles Driven To Work And/Or School:");
		int miles = sc.nextInt();
		premium = insurancePremium.milesDriven(miles);
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		if(age<16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		premium = insurancePremium.age(age);
		
		System.out.println("How many years you've been driving?");
		int yearsDriving = sc.nextInt();
		
		if(yearsDriving<=0 && age-yearsDriving<16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} 
				
		premium = insurancePremium.drivingExperience(yearsDriving, age);
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String hadAccident = sc.next();
		
		if(hadAccident.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			int accidents = sc.nextInt();
			premium = insurancePremium.carAccidents(accidents);
		}
		
		System.out.println("Have you had continuous insurance for the past 12 months?");
		String hadInsurance = sc.next();
		
		if(hadInsurance.equalsIgnoreCase("no")) {
		
			premium = insurancePremium.hadContinuousInsurance(hadInsurance);
			
		}
		
		sc.nextLine();
		
		System.out.println("What is the highest level of education you have completed?");
		String educationLevel = sc.nextLine();
		premium = insurancePremium.educationLevel(educationLevel);
		
		System.out.println(name + ", here's your quote!");
		
		System.out.println("Start Your Policy Today For: $" + premium);
		System.out.println("Reference number: " + referenceNumber(name, age, zipCode, educationLevel));
		
	}
	
	public static String referenceNumber(String name, int age, int zipCode, String educationLevel) {
		
		String referenceNumber = name.substring(0, 2).toUpperCase() + age + name.substring(name.length()-2).toUpperCase() + zipCode + educationLevel.toUpperCase();
		
		return referenceNumber;
		
	}

}
