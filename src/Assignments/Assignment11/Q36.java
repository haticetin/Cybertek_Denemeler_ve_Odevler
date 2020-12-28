package Assignments.Assignment11;

public class Q36 {

	public static void main(String[] args) {

		int[] arr = {1, 5, 5, 1, 1};
		
		System.out.println(fiveTOfive(arr));
		
	}
	
	public static boolean fiveTOfive(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==5 && arr[i+1]==5) {
				return true;
			}
		}
		
		return false;
	}

}
