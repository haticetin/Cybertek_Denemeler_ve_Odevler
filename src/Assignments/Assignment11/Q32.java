package Assignments.Assignment11;

public class Q32 {

	public static void main(String[] args) {


		String[] arr = {"apple", "banana", "pineapple", "grape", "peach"};
		
		first3(arr);
		
	}
	
	public static void first3(String[] arr) {
		
		for(String value : arr) {
			System.out.println(value.substring(0, 3));
		}
	}

}
