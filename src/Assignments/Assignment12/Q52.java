package Assignments.Assignment12;

public class Q52 {

	public static void main(String[] args) {

		int[][] arr = {{2,2,1,3,4,5}, {5,2,3,3,4,5}, {3,2,3,1,4,5}};
		
		System.out.println("matches: " + matches(arr));
		
	}
	
	public static int matches(int[][] arr) {
		
		int counter = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				if(arr[i][j]==arr[i][j+1]) {
					counter++;
				}
			}
		}
		
		return counter;
		
	}

}
