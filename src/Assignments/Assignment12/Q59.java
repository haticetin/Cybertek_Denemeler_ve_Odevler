package Assignments.Assignment12;

import java.util.Arrays;

public class Q59 {

	public static void main(String[] args) {


		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12,13}};
		
		System.out.println(Arrays.toString(mergR(arr)));
	}
	
	public static int[] mergR(int[][] arr) {
		
		int totalLength = 0;
		
		for(int[] value : arr) {
			for(int values : value) {
				totalLength++;
			}
		}
		
		int[] newArr = new int[totalLength];
		
		int n = 0;
		
		for(int[] value : arr) {
			for(int values : value) {
				newArr[n]=values;
				n++;
			}
		}
		
		return newArr;
		
	}

}
