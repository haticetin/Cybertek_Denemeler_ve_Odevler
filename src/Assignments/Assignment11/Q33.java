package Assignments.Assignment11;

public class Q33 {

	public static void main(String[] args) {

		String[] arr = {"hello", "why", "by", "apple" , "note"};

		first_lastchar(arr);
		
	}
	
	public static void first_lastchar(String[] arr) {
		
		String str = "";
		
		for(String value : arr) {
			str = value.substring(0, 1) + value.charAt(value.length()-1);
			System.out.println(str);
		}
		
	}

}
