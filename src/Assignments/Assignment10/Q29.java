package Assignments.Assignment10;

public class Q29 {

	public static void main(String[] args) {


		String str = "bla bla";
		int n = 5;
		
		System.out.println(limit(str, n));
		
	}
	
	public static String limit(String str, int n) {
		
		String newStr = "";
		
		for(int i=0; i<n; i++) {
			newStr += str.charAt(i);
		}
		
		return newStr;
	}

}
