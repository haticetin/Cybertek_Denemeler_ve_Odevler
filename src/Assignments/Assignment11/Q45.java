package Assignments.Assignment11;

public class Q45 {

	public static void main(String[] args) {


		String[] arr = {"java", "cable", "red", "vivid", "remedy", "grace"};
		
		System.out.println(shortest(arr));
		
	}
	
	public static String shortest(String[] arr) {
		
		String shortest = arr[0];
		
		for(String value : arr) {
			if(value.length()<shortest.length()) {
				shortest = value;
			}
		}
		
		return shortest;
	}

}
