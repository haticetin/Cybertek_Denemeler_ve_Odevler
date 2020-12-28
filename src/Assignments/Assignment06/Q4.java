package Assignments.Assignment06;

public class Q4 {

	public static void main(String[] args) {


		int upperBound=10;
		int counter=1;
		int sum=0;
		
		while(counter<=upperBound) {
			
			if(counter<upperBound) {
				System.out.print(counter);
				System.out.print(" + ");
			}else {
				System.out.print(counter);
				System.out.print(" = ");
			}
			
			sum=sum+counter;
			counter++;
		}
		
		System.out.println(sum);
	}
	
	
	
//		int sum=0;
//		int bound=5;
//		int x=1;
	
//		while(x<=bound) {
//			sum=sum+x;
//			System.out.print(x);
	
//			if (x<bound) 
//				System.out.print(" + ");
//				x++;
//			}
	
//		System.out.println(" = "+ sum );
	




}
