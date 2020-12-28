package Day_28_Lab.LabPart1;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {};
		
		int[] a = {7,4,6,2};
		int[] b = {};
		
		
		System.out.println(Arrays.toString(secondElement(x, y)));
		System.out.println(Arrays.toString(secondElement(a, b)));

	}
	
	public static int[] secondElement(int[] arr, int[] array) {
		
		array = new int[2];			// did we create new object????
									// one with empty and one with 2 elements
									// if array is now pointing to 2 elements object, is the other one eligible for garbage collection??
		
		array[0]=arr[0];
		array[1]=arr[arr.length-1];
		
		return array;
		
	}

}



















