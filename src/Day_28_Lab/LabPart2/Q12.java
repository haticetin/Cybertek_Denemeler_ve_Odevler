package Day_28_Lab.LabPart2;

public class Q12 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {1,3};

		int[] a = {7,2,3};
		int[] b = {1};

		int[] c = {3,2,4};
		int[] d = {4,3,4};
		
		System.out.println(start1(x, y));
		System.out.println(start1(a, b));
		System.out.println(start1(c, d));


		
	}
	
	public static int start1(int[] arr, int[] array) {
		
		int counter=0;
		
		if(arr[0]==1) {
			counter++;
		}
		
		if(array[0]==1) {
			counter++;
		}
		
		return counter;
	}

}
