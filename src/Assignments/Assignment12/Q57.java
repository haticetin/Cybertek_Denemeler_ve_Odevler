package Assignments.Assignment12;

public class Q57 {

	public static void main(String[] args) {
		
//		1 2 3
//		4 5 6
//		9 8 9
		
		int[][] squareMatrix = {{1,2,3}, {4,5,6}, {9,8,9}};
		
		int LtoR=0; 
		int RtoL=0;
		
		int n = squareMatrix[0].length-1;
		
		for(int i=0; i<squareMatrix.length; i++) {
			for(int j=0; j<squareMatrix[i].length; j++) {
				if(i==j) {
					LtoR += squareMatrix[i][i];
				}	
				if(j==n) {
					RtoL += squareMatrix[i][j];
				}
			}
			n--;
		}
		
		int difference = LtoR - RtoL;
		
		if(difference<0) {
			difference *= -1;
		}
		
		System.out.println("Their absolute difference is: " + difference);
		
	}

}
