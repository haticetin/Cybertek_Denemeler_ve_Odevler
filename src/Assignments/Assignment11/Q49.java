package Assignments.Assignment11;

import java.util.Arrays;

public class Q49 {

	public static void main(String[] args) {


		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(newArray(arr)));
		
	}
	
	public static int[] newArray(int[] arr) {
		
		int remainder = 0;
		
		if(arr.length>2) {
			remainder = arr.length-2;
		}		
		
		int[] arr2 = new int[arr.length-remainder];
		
		for(int i=0; i<arr.length-remainder; i++) {
			arr2[i]=arr[i];
		}
		
		return arr2;
	}

}
