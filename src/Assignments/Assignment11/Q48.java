package Assignments.Assignment11;

import java.util.Arrays;

public class Q48 {

	public static void main(String[] args) {

		int number = 3;
		
		System.out.println(Arrays.toString(binary(number)));
		
	}
	
	
	public static int[] binary(int number) {
		
		int[] arr = new int[8];
		
		for(int i=0; i<arr.length; i++) {
			if(number/2!=0 || number/2!=1) {
				arr[arr.length-(i+1)]=number%2;
				number = number/2;
			}else {
				break;
			}
		}
		
		
		return arr;
		
	}
	
}

/*
	3/2=1		
	1
	
	35/2= 17/2= 8/2= 4/2= 2/2= 1
	1		1	0	0		0












*/