package Assignments.Assignment12;

import java.util.Arrays;

public class Q58 {

	public static void main(String[] args) {


		int[][] arr = {{1, 2, 3}, {5, 33, 9}}; 
		
		String str = "";
		int largest = arr[0][0];
		
		for(int[] value : arr) {
			for(int values : value) {
				if(values>largest) {
					largest=values;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = largest;
			}
		}
		
		for(int[] value : arr) {
			str += Arrays.toString(value) + ", ";
		}
		
		str = str.substring(0, str.length()-2);
		
		System.out.println("[" + str + "]");
		
	}

}
