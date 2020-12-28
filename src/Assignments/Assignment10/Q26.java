package Assignments.Assignment10;

public class Q26 {

	public static void main(String[] args) {

		String word = "spoon";
		
		System.out.println(uniqueChars(word));
		
	}
	
	public static String uniqueChars(String word) {
		
		String str = "";
		
		for(int i=0; i<word.length(); i++) {
			if(!str.contains(word.substring(i, i+1))) {
				str += word.charAt(i);
			}
		}
		
		
		return str;
		
	}

}
