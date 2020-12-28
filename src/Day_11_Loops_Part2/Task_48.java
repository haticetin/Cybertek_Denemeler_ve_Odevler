package Day_11_Loops_Part2;

public class Task_48 {

	public static void main(String[] args) {


//		int row=1;
//		int column=7;
//		
//		for(int i=0; i<column; i++,row++) {
//			for(int j=0; j<row; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		int row=7;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {				// DIFFERENT WAY TO SOLVE
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
