package Week10ReviewSession;

public class ArrayIntro {

	public static void main(String[] args) {


		// declare int array with size 4
		
		int[] nums = new int[4];
		
		// assign values to each index
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 70;
		nums[3] = -5;
//		nums[4] = 300;		// Exception
		
		// print elements 
		
		System.out.println("numbers at index 0: " + nums[0]);
		System.out.println("numbers at index 1: " + nums[1]);
		System.out.println("numbers at index 2: " + nums[2]);
		System.out.println("numbers at index 3: " + nums[3]);


		int x = nums[3];
		System.out.println(x);
		
		int i = 0;
		i++;
		System.out.println(nums[i]);
		
		for(int j=0; j<nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
		
		System.out.println();
		
		// modify index 0 to 500
		
		nums[0] = 500;
		
		// read value from index1 and store into index2
		
		nums[2]=nums[1];
		System.out.println(nums[2]);
		
	}

}
