package Day_28_Lab.LabPart3;

public class Q20 {

	public static void main(String[] args) {

		int[] x = {1,2,2};
		int[] y = {1,2,1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(follows2(x));
		System.out.println(follows2(y));
		System.out.println(follows2(a));
		System.out.println(follows2(b));


		
	}
	
	public static boolean follows2(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==2 && arr[i+1]==2) {
				return true;
			}
		}
		
		return false;
	}

}
