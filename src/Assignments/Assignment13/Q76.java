package Assignments.Assignment13;

import java.util.ArrayList;

public class Q76 {

	public static void main(String[] args) {


		ArrayList<Integer> arr1 = new ArrayList<>();
		
		System.out.println(twoTimes(arr1));
		
	}
	
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> arr1){
		
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		arr1.add(1);
		arr1.add(5);
		arr1.add(3);
		arr1.add(7);
		
		for(Integer value : arr1) {
			for(int i=0; i<2; i++) {
				arr2.add(value);
			}
		}
		
		return arr2;
		
	}

}
