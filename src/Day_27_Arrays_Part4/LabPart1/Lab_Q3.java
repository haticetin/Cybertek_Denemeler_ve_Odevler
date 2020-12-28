package Day_27_Arrays_Part4.LabPart1;

public class Lab_Q3 {

	public static void main(String[] args) {

		int[] x = {1,3};
		int[] y = {1};
		
		System.out.println(sameFirstorLast(x, y));
		
	}
	
	public static String sameFirstorLast(int[] arr, int[] array) {
		
		if(!(arr.length>1)) {
			return "Array 1 is not a valid array";
		}else if(!(array.length>1)) {
			return "Array 2 is not a valid array";
		}else {
			if(arr[0]==array[0]||arr[arr.length-1]==array[array.length-1]) {
				return "true";
			}
		}
		
		return "false";
	}

}
