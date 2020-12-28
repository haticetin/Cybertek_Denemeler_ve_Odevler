package Assignments.Assignment11;

import java.util.Arrays;

public class Q47 {

	public static void main(String[] args) {

		

			int[] inhabitants = {38, 3, 9, 24, 73, 92, 7, 1};
			int day=0;
			
			int sum=1;
			
			while(sum>0) {
				
				sum=0;
				
				System.out.println("Day "+day+" "+Arrays.toString(inhabitants));
				day++;
					
				for(int i=0;i<inhabitants.length;i++) {
					
					inhabitants[i]=(inhabitants[i]/2);
					
					sum+=inhabitants[i];
				}
				
				
			}
			
		}

//		int[] arr = {3, 6, 0, 4, 3, 2, 7, 1};
//		
//		inhabitant(arr);
//	}
//	
//	public static void inhabitant(int[] arr) {
//
//		for(int i=0; true; i++) {
//			
//			int counter = 0;
//			
//			System.out.println("Day " + i + Arrays.toString(arr));
//
//			if(!control(arr).contains("false")) {
//				break;
//			}
//		}
//		
//	}
//	
//	public static int[] calculation(int[] arr) {
//				
//		for(int j=0; j<arr.length; j++) {
//			
//			arr[j] = arr[j]/2;
//			
//		}
//		
//		return arr;
//	}
//	
//	public static String control(int[] arr) {
//		
//		String str = "";
//		
//		for(int value : calculation(arr)) {
//			if(value==0) {
//				str += "true ";
//			}else {
//				str += "false ";
//			}
//		}
//		
//		return str;
//		
//	}

}
