package Day_28_Lab.LabPart4;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fizzArray(4)));
		System.out.println(Arrays.toString(fizzArray(1)));
		System.out.println(Arrays.toString(fizzArray(10)));
		
	}
	
	public static int[] fizzArray(int number) {
		
		int[] arr = new int[number];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}
		
		return arr;
		
		
	}

}
