package Day_28_Lab.LabPart4;

import java.util.Arrays;

public class Q28 {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fizzArray(5, 10)));
		System.out.println(Arrays.toString(fizzArray(11, 18)));
		System.out.println(Arrays.toString(fizzArray(1, 3)));
	}
	
	public static int[] fizzArray(int start, int end) {
		
		int[] arr = new int[end-start];
		int counter=end-start;
		
		for(int i=0; i<counter; i++) {
				arr[i]=start;
				start++;
		}
		
		return arr;
	}

}
