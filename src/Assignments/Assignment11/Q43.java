package Assignments.Assignment11;

import java.util.Arrays;

public class Q43 {

	public static void main(String[] args) {

		int[] nums = {4, 3, 2, 44, 1, 100, 55};

		System.out.println(Arrays.toString(reversed(nums)));
		
	}
	
//		n1 = n1 + n2 
//		n2 = n1 - n2
//		n1 = n1 - n2
	
	public static int[] reversed(int[] nums) {
		
		for(int i=0; i<nums.length/2; i++) {
			nums[i] = nums[i]+nums[nums.length-(i+1)];
			nums[nums.length-(i+1)] = nums[i]-nums[nums.length-(i+1)];
			nums[i] = nums[i]-nums[nums.length-(i+1)];
		}
		
		return nums;
		
	}

}
