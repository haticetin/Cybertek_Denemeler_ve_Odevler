package Day_28_Lab.LabPart3;

public class Q19 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1,2,2,6,99,99,7};
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2};
		int[] c = {1,2,2,6,99,99,7,3,4};

		System.out.println(total(x));
		System.out.println(total(y));
		System.out.println(total(a));
		System.out.println(total(b));
		System.out.println(total(c));

		
	}
	
	public static int total(int[] arr) {
		
		int sum=0;
		boolean is6=false;
		
		for(int i=0; i<arr.length; i++) {
			
			if(is6) {
				if(arr[i]==7) {
					is6=false;
				}
			}else if(arr[i]==6){
				is6=true;
			}else {
				sum+=arr[i];
			}
		}
		
		return sum;
	}

}
