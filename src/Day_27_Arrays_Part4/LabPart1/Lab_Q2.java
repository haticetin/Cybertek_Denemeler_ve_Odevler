package Day_27_Arrays_Part4.LabPart1;

import java.util.Arrays;

public class Lab_Q2 {

	public static void main(String[] args) {
		
		int[] x = {1,53,63,31,64};

		System.out.println(firstLastEqual(x));
		
	}
	
	public static String firstLastEqual(int[] arr) {
		
		if(arr.length>1) {
			for(int i=0; i<arr.length; i++) {
				if(arr[0]==arr[arr.length-1]) {
					return "true";
				}
			}
		}else {
			return "Invalid array";
		}
		
		
		return "false";
		
	}

}
