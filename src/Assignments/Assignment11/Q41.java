package Assignments.Assignment11;

public class Q41 {

	public static void main(String[] args) {

		UtopianTreeGrowth();
		
	}
	
	public static void UtopianTreeGrowth() {
		
		int growth = 0;
		
		for(int i=1; i<=10; i++) {
			if(i>3) {
				growth += 2;
				System.out.println("year " + i + " - growth " + 2 + "cm");
			}else {
				growth += 1;
				System.out.println("year " + i + " - growth " + 1 + "cm");
			}
			System.out.println("tree size: " + growth + "cm");

		}
	}

}
