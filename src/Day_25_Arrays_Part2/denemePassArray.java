package Day_25_Arrays_Part2;

import java.util.Scanner;

public class denemePassArray {

	public static void main(String[] args) {


		int[] numbers = new int[5];
		
		assignArray(numbers);
		
		showArrays(numbers);
		
		
	}
	
	public static void assignArray(int[] numbers) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a series of " + numbers.length + " numbers: ");
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Enter number " + (i+1) + " : ");
			numbers[i]=sc.nextInt();
		}
	}
	
	public static void showArrays(int[] numbers) {
		
		int largestNumber=0;
		int smallestNumber=0;
		
		for(int values : numbers) {
			if(values>0) {
				if(values>largestNumber) {
					largestNumber=values;
				}else {
					smallestNumber=values;
				}
			}else {
				if(values<smallestNumber) {
					smallestNumber=values;
				}else {
					largestNumber=values;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Largest number: " + largestNumber);
		System.out.println("Smallest number: " + smallestNumber);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
