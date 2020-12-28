package Day_28_Lab.LabPart1;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {11,5,9};
		int[] z = {110,5,98,0,1200,11,-4};

		System.out.println(Arrays.toString(greatestElement(x)));
		System.out.println(Arrays.toString(greatestElement(y)));
		System.out.println(Arrays.toString(greatestElement(z)));

		
	}
	
	public static int[] greatestElement(int[] arr) {
		
		int greatest=0;
		
		for(int value: arr) {
			if(value>greatest) {
				greatest=value;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=greatest;
		}
		
//		Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = arr[arr.length-1];
//		}
		
		return arr;
	}

}
