package Assignments.Assignment12;

import java.util.ArrayList;

public class Q67 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		timesTwo(nums);
		
	}
	
	public static void timesTwo(ArrayList<Integer> nums) {
		
		nums.add(4);
		nums.add(7);
		nums.add(10);
		nums.add(3);
		nums.add(8);
		nums.add(6);

		
		for(int i=0; i<nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		
		System.out.println(nums);
	}

}
 