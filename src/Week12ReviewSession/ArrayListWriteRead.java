package Week12ReviewSession;

import java.util.ArrayList;

public class ArrayListWriteRead {

	public static void main(String[] args) {


		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(10);
		nums.add(21);
		nums.add(-7);
		
		System.out.println("number of values: " + nums.size());
		
		System.out.println(nums.toString());
		System.out.println(nums);
		
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		
	}

}
