package Day_28_Lab.LabPart3;

public class Q16 {

	public static void main(String[] args) {

		int[] x = {2,1,2,3,4};
		int[] y = {2,2,0};
		int[] z = {1,3,5};

		System.out.println(countEven(x));
		System.out.println(countEven(y));
		System.out.println(countEven(z));

		
		
	}
	
	public static int countEven(int[] arr) {
		
		int counter=0;
		
		for(int value : arr) {
			if(value%2==0) {
				counter++;
			}
		}
		
		return counter;
	}

}
