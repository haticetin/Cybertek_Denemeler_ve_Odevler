package Day_27_Arrays_Part4;

public class length {

	public static void main(String[] args) {


		int[][] numbers = {
				{1,2,3,4},				// row 0
				{5,6},					// row 1
				{9,10,11,23,30,50,60}	// row 2
		};
		
		// display the number of rows
		
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
	
		// display the number of columns in each row
		
		System.out.println();
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.println("The number of columns in row " + (i+1) + " is " + numbers[i].length);
			
		}
		
		System.out.println();
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("The points of team " + (i+1) + " : ");
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(numbers[0]);			// [I@4517d9a3
		System.out.println(numbers[0][0]);		// 1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
