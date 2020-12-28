package Assignments.Assignment07;

public class Q6 {

	public static void main(String[] args) {

		int row=5;
		int k = 0;
		
		for(int i=1; i<=row; i++) {
			for(int j=0; j<i; j++) {
				if(j==0) {
					System.out.print(i + " ");
				}else if(j==1){
					k = i + (row-j);
					System.out.print(k + " ");
				}else {
					k+=(row-j);
					System.out.print(k + " ");
				}
			}
			System.out.println();
		}
		
	
		
		
		
		
//		1
//		26
//		3710
//		481113
//		59121415
		
		
		
		
		
	}

}
