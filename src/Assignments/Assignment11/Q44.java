package Assignments.Assignment11;

public class Q44 {

	public static void main(String[] args) {

		int[] arr = {80, 88, 88, 84, 82, 78, 60, 68};
		
		System.out.println(average(arr));
		
	}
	
	public static double average(int[] arr) {
		
		double sum = 0;
		
		for(int value : arr) {
			sum += value;
		}
		
		double average = sum/arr.length;
		
		return average;
		
	}

}
