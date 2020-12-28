package Day_15_Method_Overloading;

public class Assignment3_Fibonacci {

	public static void main(String[] args) {

		int count=8;
		int pre1=0;
		int pre2=1;
		
		System.out.println("Fibonacci series of " + count + " numbers");
		
		for(int i=1; i<=count; i++) {
			
			System.out.print(pre1 + " ");
			
			int sum=pre1+pre2;
			pre1=pre2;
			pre2=sum;
						
			
				
		}
	}

}
