package Day_28_Lab.LabPart1;

public class Q4 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {5,11,2};
		int[] z = {7,0,0};
		int[] a = {3,-2,10,4};
		
		System.out.println(sumNumbers(x));
		System.out.println(sumNumbers(y));
		System.out.println(sumNumbers(z));
		System.out.println(sumNumbers(a));

	}
	
	public static String sumNumbers(int[] numbers) {
		
		int sum=0;
		
		for(int value : numbers) {
			sum+=value;
		}
		
		return "Sum of all numbers: " + sum;
	}

}
