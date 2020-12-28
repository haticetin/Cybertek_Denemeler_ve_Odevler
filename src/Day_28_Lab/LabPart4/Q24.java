package Day_28_Lab.LabPart4;

public class Q24 {

	public static void main(String[] args) {

		int[] x = {1,2,1,3,2};
		int a = 2;
		
		int[] y = {1,2,1,3};
		int b = 1;
		
		System.out.println(everywhere(x, a));
		System.out.println(everywhere(y, b));
		
	}
	
	public static boolean everywhere(int[] arr, int number) {
		
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i]==number) {
				if(arr[i+1]==number||arr[i+2]==number) {
					return true;
				}
			}
		}
		
		return false;
	}

}
