package Assignments.Assignment06;

public class Q5 {

	public static void main(String[] args) {


		int end=9;
		int i=1;
		
		System.out.print("Odd numbers in " + end + " : ");
		
		while(i<=end) {
			if(i%2!=0) {
				if(i<=end) {
				System.out.print(i);
					if(i!=end && i!=end-1) {
						System.out.print(",");
					}
				}
			}
			i++;
		}
	}

}
