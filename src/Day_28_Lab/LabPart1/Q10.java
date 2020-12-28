package Day_28_Lab.LabPart1;

public class Q10 {

	public static void main(String[] args) {

		int[] x = {2,2};
		int[] y = {3,3};
		int[] a = {2,3};
		int[] b = {12,20,42};
		int[] c = {2,2,2};
		
		System.out.println(has2or3twice(x));
		System.out.println(has2or3twice(y));
		System.out.println(has2or3twice(a));
		System.out.println(has2or3twice(b));
		System.out.println(has2or3twice(c));



		
	}

	public static boolean has2or3twice(int[] arr) {
		
		int counter2=0;
		int counter3=0;
		
		for(int value : arr) {
			
			if(value==2) {
				counter2++;
			}else if(value==3) {
				counter3++;
			}
		}
		
		if((counter2==2)||(counter3==2)) {
			return true;
		}
		
		return false;
	}
}
