package Assignments.Assignment06;

public class Q2 {

	public static void main(String[] args) {

		int pre1=0;
		int pre2=1;
		int sum;
		
		for(int i=1; i<=15; i++) {
			
			System.out.print(pre1 + " ");
			
			sum=pre1+pre2;
			pre1=pre2;
			pre2=sum;
			
		}
		
		
		// 2nd Way:
		
//		int n=10;
//		int oldNumber=0;
//		int newNumber=1;
//		
//		for (int i=1; i<=n; i++) {
//			if (oldNumber < newNumber) {
//				
//				System.out.print( oldNumber + ",");
//				
//				oldNumber = oldNumber + newNumber;
//				
//			} else {
//				
//					System.out.print( newNumber + ",");
//					
//					newNumber = newNumber + oldNumber;
//			}
//		}
		
//		System.out.println();
		
		// 3rd Way:
		
//		int n=10;
//		int fib,b=1,a=0;
//		System.out.print(a+","+b);
//		for (int i=2; i<n;i++) {
//			fib=b+a;
//			a=b;
//			b=fib;
//			System.out.print(","+fib);
//		}
		
		
	}
			
	
}

