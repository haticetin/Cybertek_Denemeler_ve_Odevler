package Assignments.Assignment11;

public class Q35 {

	public static void main(String[] args) {

		String str = "Java is fun";
		
		System.out.println(reversed(str));
		
	}
	
	public static String reversed(String str) {
		
		String[] arr = str.split(" ");
		
		String newStr = "";
		
		for(int i=arr.length-1; i>=0; i--) {
			
			newStr += arr[i] + " ";
			
		}
		
		newStr = newStr.substring(0, newStr.length()-1);
		
		return newStr;
	}

}
