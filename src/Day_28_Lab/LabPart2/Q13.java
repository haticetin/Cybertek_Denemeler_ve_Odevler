package Day_28_Lab.LabPart2;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		
		int[] y = {3,4};
		int[] x = {1,2};
		int[] a = {5,6};
		int[] b = {3,8};
		int[] c = {1,1};
		int[] d = {1,0};
		
		System.out.println(sumComparison(x, y));
		System.out.println(sumComparison(a, b));
		System.out.println(sumComparison(c, d));


		
	}

	public static String sumComparison(int[] arr, int[] array) {
		
		int sum1=0;
		int sum2=0;
		
		for(int value : arr) {
			sum1+=value;
		}
		
		for(int values : array) {
			sum2+=values;
		}
		
		if(sum1==sum2) {
			return "equal";
		}else if(sum2>sum1) {
			return Arrays.toString(array);
		}
		
		return Arrays.toString(arr);
		
	}
}
