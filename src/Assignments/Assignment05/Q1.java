package Assignments.Assignment05;

public class Q1 {

	public static void main(String[] args) {


		int numOfBedroom, startingPrice;
		numOfBedroom=2;
		startingPrice=0;
		
		if(numOfBedroom==1) {
			System.out.println("One Bedroom Selected");
			startingPrice=1100;
		}else if(numOfBedroom==2) {
			System.out.println("Two Bedrooms Selected");
			startingPrice=1850;
		}else if(numOfBedroom==3) {
			System.out.println("Three Bedrooms Selected");
			startingPrice=2550;
		}else {
			System.out.println("No such Bedrooms available");
		}
		
		System.out.println("Starting Price: $" + startingPrice);
	}

}
