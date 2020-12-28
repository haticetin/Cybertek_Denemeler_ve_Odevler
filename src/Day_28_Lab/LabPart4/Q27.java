package Day_28_Lab.LabPart4;

public class Q27 {

	public static void main(String[] args) {
		
		
		int[] x = {1,4,5,6,2};
		int[] y = {1,2,3};
		int[] z = {1,2,4,5,8,9};

		System.out.println(increasingAdjacent(x));
		System.out.println(increasingAdjacent(y));
		System.out.println(increasingAdjacent(z));

		
	}
	
	public static boolean increasingAdjacent(int[] arr) {
		
		for(int i=0; i<arr.length-2; i++) {
			
			if(arr[i+1]==(arr[i]+1)) {
				if(arr[i+2]==(arr[i+1]+1)) {
					return true;
				}
			}
		}
		
		return false;
	}

}
