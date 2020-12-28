package Day_28_Lab.LabPart1;

public class Q8 {

	public static void main(String[] args) {

		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(contains2or3(x));
		System.out.println(contains2or3(y));
		System.out.println(contains2or3(z));

		
	}
	
	public static boolean contains2or3(int[] arr) {
		
		for(int value : arr) {
			if((value==2)||(value==3)){
				return true;
			}
		}
		
		return false;
	}

}
