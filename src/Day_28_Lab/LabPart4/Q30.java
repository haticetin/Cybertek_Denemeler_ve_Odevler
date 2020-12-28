package Day_28_Lab.LabPart4;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int n1 = 2;
		int[] y = {1,2,3,2,5,2};
		int n2 = 2;
		
		System.out.println(Arrays.toString(notAlone(x, n1)));
		System.out.println(Arrays.toString(notAlone(y, n2)));	
		
	}
	
	public static int[] notAlone(int[] arr, int num) {
		
		
		
		for(int i=0; i<arr.length; i++) {
			if(i!=0 && i!=arr.length-1) {
				if(arr[i]==num) {
					if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]) {
						if(arr[i-1]>arr[i+1]) {
							arr[i]=arr[i-1];
						}else {
							arr[i]=arr[i+1];
						}
					}
				}
			}
		}
		
		return arr;
	}

}
