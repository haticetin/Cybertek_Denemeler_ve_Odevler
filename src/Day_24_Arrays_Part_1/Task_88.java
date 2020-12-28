package Day_24_Arrays_Part_1;

import java.util.*;

public class Task_88 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		String[] cars = new String[7];
		
		
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Nissan";
		cars[3]="BMW";
		cars[4]="Mercedes";
		cars[5]="Porsche";
		cars[6]="Ferrari";
		
		System.out.print("Select your car: ");
		
		int userInput = sc.nextInt();
		
		int randomPrice=0;
		
		switch(cars[userInput]) {
		
		case "Honda": case "Toyota": case "Nissan":
			randomPrice = rn.nextInt(20000)+20000;
			break;
		case "BMW": case "Mercedes":
			randomPrice = rn.nextInt((80000-50000)+1)+50000;
			break;
		case "Porsche": case "Ferrari":
			randomPrice = rn.nextInt((150000-100000)+1)+100000;
			break;
		default:
			System.out.println("Invalid car!");
				
		}
		
		System.out.println("Price for selected car is $" + randomPrice);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
