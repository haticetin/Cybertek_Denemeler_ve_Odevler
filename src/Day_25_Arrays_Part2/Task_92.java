package Day_25_Arrays_Part2;

import java.util.Arrays;

public class Task_92 {

	public static void main(String[] args) {


		int[] multipleOf19;
		multipleOf19=new int[10];
		
		
		for(int i=0; i<multipleOf19.length; i++) {
			multipleOf19[i]=19*(i+1);
		}
		
		for(int i=0; i<multipleOf19.length; i++) {
			System.out.println(multipleOf19[i]);
		}
		
		
		System.out.println(Arrays.toString(multipleOf19));
	}

}
