package Assignments.Assignment07;

public class Q5 {

	public static void main(String[] args) {
		
		int row=8;
		int column=row-1;
		int num=1;

		for(int i=1; i<=row; i++) {
			for(int j=column; j>=i; j--) {
				System.out.print(num);
			}
			
			for(int k=0; k<i; k++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

	
}
