package Assignments.Assignment12;

import java.util.Arrays;

public class Q54 {

	public static void main(String[] args) {


		int[][] values = new int[2][3];
		
		values[0][0] = 8;
		values[0][1] = 20;
		values[0][2] = 50;
		
		values[1][0] = 12;
		values[1][1] = 30;
		values[1][2] = 75;
		
		String str = "";
				
		for(int[] value : values) {
			str += Arrays.toString(value) + ", ";
		}
	
		str = str.substring(0, str.length()-2);
		
		System.out.println("[" + str + "]");
						
	}

}
