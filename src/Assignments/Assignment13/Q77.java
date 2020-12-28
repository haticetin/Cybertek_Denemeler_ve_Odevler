package Assignments.Assignment13;

public class Q77 {

	public static void main(String[] args) {

		int[] arr = {1,1,1,0};
		int limit = 6;
		
		System.out.println(badP(arr, limit));
		
	}
	
	public static boolean badP(int[] arr, int limit) {
		
		int numOfBroken = 0;
		
		for(int value : arr) {
			if(value==0) {
				numOfBroken++;
			}
		}
		
		if(numOfBroken<limit) {
			return true;
		}
		
		return false;
	}

}
