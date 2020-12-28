package Day_24_Arrays_Part_1;

import java.util.Scanner;

public class Task_86 {

	public static void main(String[] args) {


		String[] months = new String[12];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter month number please: ");
		
		months[0]="January";
		months[1]="February";
		months[2]="March";
		months[3]="April";
		months[4]="May";
		months[5]="June";
		months[6]="July";
		months[7]="August";
		months[8]="September";
		months[9]="October";
		months[10]="November";
		months[11]="December";
		
		int userInput = sc.nextInt();

		 System.out.println("The month name is " + months[userInput-1]);

		
		
		
		
		
	}

}























