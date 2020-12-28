package Assignments.Assignment06;

public class Q7 {

	public static void main(String[] args) {

		
		String space=" ";
		int num=8;

		for(int i=num; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(j + space);
			}
			System.out.println();
			for(int k=num+1; k>i; k--) {
				System.out.print(space);
			}
			
		}
		
//		System.out.println();
//		
//		int rows = 5;
//		String blank=""; // that variable is just to align the numbers
//		
//		for(int i=rows; i>=1;i--) {
//			System.out.print(blank);
//				for(int j=i;j>=1;j-- ) {
//					System.out.print(j + " ");
//				}
//			blank=blank+" ";
//			System.out.println("\n");
//		}
		
		
		
		
	
		
	}

}
