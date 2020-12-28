package Assignments.Assignment08;

public class Q4 {

	public static void main(String[] args) {

		printHollowRect();
		
	}

	public static void printHollowRect() {

		for(int i=1; i<=5; i++) {
			System.out.print("*");
			for(int j=1; j<=4; j++) {
				if(i==1||i==5) {
					System.out.print("*");
				}else {
					if(j==4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}
	
	

}
