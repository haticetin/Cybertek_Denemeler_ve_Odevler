package Day_28_Lab.LabPart2;

import java.util.Arrays;

public class Q11 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {1,2,1};
		int[] a = {11,2,13,3,2};

		System.out.println(Arrays.toString(is2followedBy3(x)));
		System.out.println(Arrays.toString(is2followedBy3(y)));
		System.out.println(Arrays.toString(is2followedBy3(z)));
		System.out.println(Arrays.toString(is2followedBy3(a)));

		
	}
	
	public static int[] is2followedBy3(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==2) {
				if(arr[i+1]==3) {
					arr[i+1]=0;
				}
			}
			
		}
		
		return arr;
		
	}

}
