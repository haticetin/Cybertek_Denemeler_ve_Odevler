package Day_28_Lab.LabPart3;

import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {

		int[] x = {10,3,5,6};
		int[] y = {-7,-2,-10,-9};
		int[] z = {2,10,7,2};

		System.out.println(difLargestSmallest(x));
		System.out.println(difLargestSmallest(y));
		System.out.println(difLargestSmallest(z));

		
	}
	
	public static int difLargestSmallest(int[] arr) {
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int value : arr) {
			if(value>largest) {
				largest=value;
			}else if(value<smallest) {
				smallest=value;
			}
		}
		
		return largest-smallest;
		
//		Arrays.sort(arr);
	
//		return arr[arr.length-1]-arr[0];
		
		
		
	}

}
