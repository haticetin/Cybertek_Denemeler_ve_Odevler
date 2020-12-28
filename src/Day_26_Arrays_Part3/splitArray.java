package Day_26_Arrays_Part3;

import java.util.Arrays;

public class splitArray {

	public static void main(String[] args) {


		String str = "It will display the array of the size";
		
		String[] arr = str.split(" ");	// space'leri siliyor
//								  |	
//								   -> -> -> -> delimeter
								   
		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[2]);
		System.out.println(arr[arr.length-1]);
		
		System.out.println("===============================");
		
		for(String value : arr) {
			
			System.out.println(value);
			
		}
		
		
	}

}
