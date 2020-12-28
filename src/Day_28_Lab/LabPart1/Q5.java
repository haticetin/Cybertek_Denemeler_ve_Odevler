package Day_28_Lab.LabPart1;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {17,12,10,8};
		int[] a = {7,0,0};
		
		System.out.println(Arrays.toString(rotateArray(x)));
		System.out.println(Arrays.toString(rotateArray(y)));
		System.out.println(Arrays.toString(rotateArray(a)));

	}
	
	public static int[] rotateArray(int[] arr) {
		
		int x = arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			
			arr[i]=arr[i+1];
			
		}
		
		arr[arr.length-1] = x;
		
		return arr;
	}

}
