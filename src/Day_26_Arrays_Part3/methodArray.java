package Day_26_Arrays_Part3;

import java.util.Random;

public class methodArray {

	public static void main(String[] args) {

		printArray(10);
		
	}
	
	public static int[] createArray(int arraySize) {
		
		Random rn = new Random();
		
		int[] myArray = new int[arraySize];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i] = rn.nextInt(100);	
		}
		
		return myArray;
	}
	
	public static void printArray(int numbers) {
		
		 for(int value : createArray(numbers)) {
			 System.out.println(value);
		 }
	}
	

}
