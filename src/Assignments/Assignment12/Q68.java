package Assignments.Assignment12;

import java.util.ArrayList;

public class Q68 {

	public static void main(String[] args) {


		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		System.out.println(addElements(arr1, arr2));
		
	}
	
	public static ArrayList<Integer> addElements(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr1.add(10);
		arr1.add(40);
		arr1.add(50);
		arr1.add(3);
		arr1.add(1);
		
		arr2.add(11);
		arr2.add(0);
		arr2.add(500);
		arr2.add(44);
		arr2.add(1101);
		
		for(int i=0; i<arr1.size(); i++) {
			arr.add(arr1.get(i)+arr2.get(i));
		}
		
		return arr;
		
	}

}
