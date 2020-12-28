package Day_28_Lab.LabPart4;

public class Q21 {

	public static void main(String[] args) {

		int[] x = {2,3,2,2,4,2};
		int[] y = {2,3,2,2,4,2,2};
		int[] z = {1,2,3,4};
		
		System.out.println(sum2is8(x));
		System.out.println(sum2is8(y));
		System.out.println(sum2is8(z));

		
	}
	
	public static boolean sum2is8(int[] arr) {
		
		int sum=0;
		
		for(int value : arr) {
			if(value==2) {
				sum+=value;
			}
		}
		
		if(sum==8) {
			return true;
		}
		
		return false;
	}

}
