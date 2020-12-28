package Day_26_Arrays_Part3;

public class Array_2D_Array {

	public static void main(String[] args) {


		int[][] scores = new int[3][];	// row number must be put,
										// column number can be put later because it might change
		
		int[][] score = new int[3][4];	// ikisi de same data type mi olmali??
										// Row => String; Column => int istiyorsak ne yapmaliyiz?
		
		System.out.println(score[0][0]);	// default values for column is 0 since int[][]
		System.out.println(score[1]);
		
		System.out.println(scores[0]);	// when column is not created
		System.out.println(scores[1]);	// default value for address is null
		System.out.println(scores[2]);	// since address is a String
		
		// print 2nd row
		
		System.out.println(score[1][0]);
		System.out.println(score[1][1]);
		System.out.println(score[1][2]);
		System.out.println(score[1][3]);
		
		System.out.println("================================");

		score[0][0] = 10;
		score[0][1] = 20;
		score[0][2] = 30;
		score[0][3] = 40;
		
		score[1][0] = 50;
		score[1][1] = 60;
		score[1][2] = 70;
		score[1][3] = 80;

		score[2][0] = 90;
		score[2][1] = 100;
		score[2][2] = 110;
		score[2][3] = 120;
		
		System.out.println(score[1][0]);
		System.out.println(score[1][1]);
		System.out.println(score[1][2]);
		System.out.println(score[1][3]);

		

		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	} 

}
