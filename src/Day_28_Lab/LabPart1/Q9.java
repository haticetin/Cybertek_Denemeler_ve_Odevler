package Day_28_Lab.LabPart1;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {

		int[] x = {4,5,6};
		
		System.out.println(Arrays.toString(doubleLength(x)));
		
	}
	
	public static int[] doubleLength(int[] arr) {
		
		int[] newArray = new int[arr.length*2];
		
		newArray[newArray.length-1]=arr[arr.length-1];
		
		return newArray;
	}

}
