package Day_28_Lab.LabPart4;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {

		int[] x = {2,10,3,4,20,5};
		int[] y = {10,1,20,2};
		
		System.out.println(multiple10(x));
		System.out.println(multiple10(y));
		
	}
	
	public static String multiple10(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%10==0) {
				
				for(int j=i+1; j<arr.length && arr[j]%10!=0; j++) {
					arr[j]=arr[i];
				}
			}
				
		}
		
		return Arrays.toString(arr);
	}

}
