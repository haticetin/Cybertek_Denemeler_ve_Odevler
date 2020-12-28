package Assignments.Assignment11;

public class Q38 {

	public static void main(String[] args) {


		int[] nums = {1, 3, 5, 7, 9};
		
		System.out.println(numberOfEven(nums));
		
	}
	
	public static int numberOfEven(int[] nums) {
		
		int even = 0;
		
		for(int value : nums) {
			if(value%2==0) {
				even++;
			}
		}
		
		return even;
	}

}
