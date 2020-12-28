package Assignments.Assignment04;

public class Q14 {

	public static void main(String[] args) {


		int numBooks, points;
		numBooks=4;
		points=0;
		
		if(numBooks==0) {
			points=0;
		}else if(numBooks==1) {
			points=5;
		}else if(numBooks==2) {
			points=15;
		}else if(numBooks==3) {
			points=30;
		}else if(numBooks>=4) {
			points=60;
		}else {
			System.out.println("Not a valid purchase");
		}
		
		System.out.println("Your points: " + points);
	}

}
