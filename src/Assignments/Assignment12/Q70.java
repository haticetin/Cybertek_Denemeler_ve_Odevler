package Assignments.Assignment12;

import java.util.ArrayList;

public class Q70 {

	public static void main(String[] args) {


		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println(do_switch(arr));
		
	}
	
	public static ArrayList<Integer> do_switch(ArrayList<Integer> arr){
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		int dummy = arr.get(0);
		
		arr.set(0, arr.get(arr.size()-1));
		arr.set(arr.size()-1, dummy);
		
		return arr;
		
	}

}
