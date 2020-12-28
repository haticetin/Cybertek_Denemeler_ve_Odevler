package Assignments.Assignment11;

import java.util.Arrays;

public class Q46 {

	public static void main(String[] args) {


		String[] arr = {"olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray"};

		System.out.println(Arrays.toString(shortestInOrder(arr)));
		
	}
	
	public static String[] shortestInOrder(String[] arr) {
		
		String shortest = "";
		int x = arr[0].length();
		
		for(String value : arr) {
			if(value.length()<x) {
				x = value.length();
			}
		}
		
		for(String values : arr) {
			if(values.length()==x) {
				shortest += values + " ";
			}
		}
		
		String[] Shortest = shortest.split(" ");
		Arrays.sort(Shortest);
		
		return Shortest;
	}

}
