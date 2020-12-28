package Assignments.Assignment11;

import java.util.Arrays;

public class Q37 {

	public static void main(String[] args) {

		String[] arr = {"hello", "why", "by", "apple" , "note"};
		
		System.out.println(first_last(arr));
		
	}
	
	public static String first_last(String[] arr) {
		
		String str = "";
		
		for(String value : arr) {
			str += value.substring(0, 1) + value.charAt(value.length()-1) + " ";
		}
		
		arr = str.split(" ");
		
		return Arrays.toString(arr);
	}

}
