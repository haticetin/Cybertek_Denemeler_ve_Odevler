package Day_28_Lab.LabPart2;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {

		int[] x = {1,2};
		int[] y = {3,4};
		int[] a = {4,4};
		int[] b = {2,2};
		int[] c = {9,2};
		int[] d = {3,4};
		
		System.out.println(allArrays(x, y));
		System.out.println(allArrays(a, b));
		System.out.println(allArrays(c, d));


		
	}
	
	public static String allArrays(int[] arr, int[] array) {
		
		int[] newArray = new int[arr.length+array.length];
		
		for(int i=0; i<arr.length; i++) {
			newArray[i]=arr[i];
		}
		
		int counter=-1;
		
		for(int i=arr.length; i<newArray.length; i++) {
			newArray[i]=array[++counter];
		}
		
		return Arrays.toString(newArray);
	}

}
