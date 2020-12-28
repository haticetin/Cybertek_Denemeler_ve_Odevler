package Assignments.Assignment11;

import java.util.Arrays;

public class Q51 {

	public static void main(String[] args) {


		int[] outer = {1, 2, 4};
		int[] inner = {6, 5};
		
		System.out.println(innerInOuter(outer, inner));
	}
	
	public static boolean innerInOuter(int[] outer, int[] inner) {
		
		Arrays.sort(outer);
		Arrays.sort(inner);
		String Outer = "";
		String Inner = "";
		
		int counter = 0;
		
		for(int value : outer) {
			Outer += String.valueOf(value);
		}
		for(int values : inner) {
			Inner += String.valueOf(values);
		}
		
		if(Outer.contains(Inner)) {
			return true;
		}
		
		return false;

	}

}
