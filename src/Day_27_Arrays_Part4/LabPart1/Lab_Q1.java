package Day_27_Arrays_Part4.LabPart1;

public class Lab_Q1 {

	public static void main(String[] args) {

		int[] y = {13,6,1,2,3};
		System.out.println(firstLast6(y));
		
	}
	
	public static boolean firstLast6(int[] arr) {
		
		if(arr.length>=1) {
			for(int i=0; i<arr.length; i++) {
				if(arr[0]==6||arr[arr.length-1]==6) {
					return true;
				}
			}
		}else {
			System.out.println("Invalid array");
		}
		
		return false;
	}

	
		
	
	
	
}
