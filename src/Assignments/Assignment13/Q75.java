package Assignments.Assignment13;

import java.util.ArrayList;

public class Q75 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();
		
		String target = "goodbye";
		
		System.out.println(search(arr, target));
		
	}
	
	public static String search(ArrayList<String> arr, String target) {
		
		arr.add("hello");
		arr.add("world");
		
		for(String value : arr) {
			if(value.contains(target)) {
				return value;
			}
		}
		
		return "search failed";	
		
	}

}
