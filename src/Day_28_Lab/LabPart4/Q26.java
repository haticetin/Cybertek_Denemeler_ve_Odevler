package Day_28_Lab.LabPart4;

public class Q26 {

	public static void main(String[] args) {
		
		int[] x = {2,1,3,5};
		int[] y = {2,1,2,5};
		int[] z = {2,4,2,5};


		System.out.println(odd3even3(x));
		System.out.println(odd3even3(y));
		System.out.println(odd3even3(z));

		
	}
	
	public static boolean odd3even3(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]%2==0) {
				if(arr[i+1]%2==0) {
					if(arr[i+2]%2==0) {
						return true;
					}
				}
			}else if(arr[i]%2!=0) {
				if(arr[i+1]%2!=0) {
					if(arr[i+2]%2!=0) {
						return true;
					}
				}
			}
		}
		
		return false;
	}

}
