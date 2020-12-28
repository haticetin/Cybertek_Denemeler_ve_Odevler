package Day_28_Lab.LabPart4;

public class Q22 {

	public static void main(String[] args) {


		int[] x = {1,4,1};
		int[] y = {1,4,1,4};
		int[] z = {1,1};
		
		System.out.println(onesVSfours(x));
		System.out.println(onesVSfours(y));
		System.out.println(onesVSfours(z));

		
		
	}
	
	public static boolean onesVSfours(int[] arr) {
		
		int counter1=0;
		int counter4=0;
		
		for(int value: arr) {
			if(value==1) {
				counter1++;
			}else if(value==4) {
				counter4++;
			}
		}
		
		if(counter1>counter4) {
			return true;
		}
		
		return false;
	}
	
}
