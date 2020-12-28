package Assignments.Assignment11;

import java.util.Arrays;

public class Q50 {

	public static void main(String[] args) {


		int[] arr = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(doubleArray(arr)));
	}
	
	public static int[] doubleArray(int[] arr) {
		
		int[] arr2 = new int[arr.length*2];
		
		for(int value : arr) {
			if(value==arr[arr.length-1]) {
				arr2[arr2.length-1]=value;
			}
		}
		
		return arr2;
		
	}

}
