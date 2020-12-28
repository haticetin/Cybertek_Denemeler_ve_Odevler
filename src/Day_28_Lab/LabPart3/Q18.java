package Day_28_Lab.LabPart3;

public class Q18 {

	public static void main(String[] args) {
		
		int[] x = {1,2,2,1};
		int[] y = {1,1};
		int[] a = {1,2,2,1,13};
		int[] b = {1,2,2,1,13,3};

		System.out.println(sum(x));
		System.out.println(sum(y));
		System.out.println(sum(a));
		System.out.println(sum(b));

		
		
	}
	
	public static int sum(int[] arr) {
		
		int sum=0;
		
		for(int value : arr) {
			if(value!=13) {
				sum+=value;
			}else {
				break;
			}
			
		}
		
		return sum;
	}

}
