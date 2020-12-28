package Assignments.Assignment10;

public class Q31 {

	public static void main(String[] args) {


		String str = "Nurses Run";
		
		System.out.println(isPalindrome(str));
		
	}
	
	public static boolean isPalindrome(String str) {
		
		str = str.toLowerCase();
		str = str.replace(" ", "");
		
		String newStr = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			newStr += str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(newStr)) {
			return true;
		}
		
		return false;
	}

}
