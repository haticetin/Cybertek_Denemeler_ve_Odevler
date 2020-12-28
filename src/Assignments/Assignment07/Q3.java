package Assignments.Assignment07;

public class Q3 {

	public static void main(String[] args) {

		
		String space = "";
		int row=7;
		int column=7;
		
		for(int i=1; i<=row; i++) {
			System.out.print(space);
			
			for(int j=i; j<=column; j++) {
				System.out.print(j + " ");
			}
			space += " ";
			System.out.println();
		}
		
		int num=row-1;
		
		for(int i=1; i<=column-1; i++) {
			for(int j=i; j<=column-2; j++) {
				System.out.print(" ");
			}
			for(int k=num; k<=row; k++) {
				System.out.print(k + " ");
			}
			num--;
			System.out.println();
		}
	}

}
