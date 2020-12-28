package Day_25_Arrays_Part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {


		// This program stores in an array the hours worked for by 5 employees who all make the same hourly wage
		// display their gross pay
		
		Scanner sc = new Scanner(System.in);
		
		int[] hours;
		hours = new int[5];
		
		for(int i=0; i<hours.length; i++) {
			System.out.print("Please enter hours you worked: ");
			hours[i]=sc.nextInt();
		}
		
		for(int i=0; i<hours.length; i++) {
			System.out.println("Person " + (i+1) + " gross pay is $" + hours[i]*20);
		}

	}

}
