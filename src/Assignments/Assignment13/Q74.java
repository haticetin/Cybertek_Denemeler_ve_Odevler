package Assignments.Assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q74 {

	public static void main(String[] args) {


		ArrayList<Integer> arr = new ArrayList<>();
		
		int target = 4;
		
		System.out.println((romoveInts(arr, target)));
		
	}
	
	public static ArrayList<Integer> romoveInts(ArrayList<Integer> arr, int target){
		
		arr.add(3);
		arr.add(4);
		arr.add(3);
		arr.add(3);
		
		while(removing(arr, target).contains(target)) {
			removing(arr, target);
		}
		
		
		return arr;
	}
	
	public static ArrayList<Integer> removing(ArrayList<Integer> arr, int target){
		
		for(Integer value : arr) {
			if(value==target) {
				arr.remove(value);
				break;
			}
		}
		return arr;
	}

}
