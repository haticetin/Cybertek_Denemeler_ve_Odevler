package Assignments.Assignment06;

public class Q9 {

	public static void main(String[] args) {


		int row=8;
		int column=4;
		String letter;
		
		for(int i=1; i<=row; i++) {
			if(i%2==0) {
				letter="B W ";
			}else {
				letter="W B ";
			}
			for(int j=1; j<=column; j++) {
				System.out.print(letter);
			}
			System.out.println();
		}
		
//		System.out.println();
//		
//		int num=8;
//		
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=num;j++) {
//				if ((i+j)%2 == 0) {
//					System.out.print("W ");
//				} else {
//					System.out.print("B ");
//				}
//			}
//			
//		System.out.println();
		
//		}
		
	}

}
