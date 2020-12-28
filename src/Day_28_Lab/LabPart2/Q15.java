package Day_28_Lab.LabPart2;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {

		int[] x = {1,2,3,4};
		int[] y = {3,2,1};
		int[] z = {5,6,7,9,8};
		
		System.out.println(Arrays.toString(swapElements(x)));
		System.out.println(Arrays.toString(swapElements(y)));
		System.out.println(Arrays.toString(swapElements(z)));


		
	}
	
	public static int[] swapElements(int[] arr) {
		
//		int x;
//		
//		x= arr[arr.length-1];
//		arr[arr.length-1]=arr[0];
//		arr[0]=x;
		
		arr[0]=arr[0]+arr[arr.length-1];
		arr[arr.length-1]=arr[0]-arr[arr.length-1];
		arr[0]=arr[0]-arr[arr.length-1];
		
		return arr;
	}

}
