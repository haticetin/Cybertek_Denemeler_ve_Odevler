package Assignments.Assignment13;

import java.util.Arrays;

public class Q71 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		System.out.println(Arrays.toString(populate(arr)));
		
	}
	
	public static int[] populate(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		return arr;
	}

}
