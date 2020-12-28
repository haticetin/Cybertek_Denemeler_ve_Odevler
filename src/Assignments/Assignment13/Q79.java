package Assignments.Assignment13;

import java.util.Arrays;

public class Q79 {

	public static void main(String[] args) {

		int [][] matrix = {{2,3,5},{1,1,2}};
		
		int n = 2;
		
		System.out.println(scalar(matrix, n));
		
	}
	
	public static String scalar(int[][] matrix, int n){
		
		String str = "";
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] *= n;
			}
		}
		
		for(int[] value : matrix) {
			str += Arrays.toString(value) + ", ";
		}
		
		str = str.substring(0, str.length()-2);
		
		return "[" + str + "]";
		
	}

}
