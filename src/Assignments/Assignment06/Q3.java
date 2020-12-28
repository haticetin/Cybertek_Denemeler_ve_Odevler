package Assignments.Assignment06;

public class Q3 {

	public static void main(String[] args) {

		
		int num;
		
		System.out.println("Numbers divisible by 5 between 1-100:");

		for(num=1; num<=100; num++) {
			if(num%5==0) {
				System.out.print(num + " ");
			}
		}
	}

}
