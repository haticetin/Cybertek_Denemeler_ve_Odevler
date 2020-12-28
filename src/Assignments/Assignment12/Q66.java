package Assignments.Assignment12;

import java.util.ArrayList;

public class Q66 {

	public static void main(String[] args) {

		ArrayList<Integer> ints = new ArrayList<>();
		
		System.out.println(appendPosSum(ints));
		
	}
	
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> ints){
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		ints.add(4);
		ints.add(-6);
		ints.add(3);
		ints.add(-8);
		ints.add(0);
		ints.add(4);
		ints.add(3);
		
		int sum = 0;
		
		for(int value : ints) {
			if(value>0) {
				sum += value;
				arr.add(value);
			}
		}
		
		arr.add(sum);
		
		return arr;
		
	}

}
