package Assignments.Assignment09;

public class Q6 {

	public static void main(String[] args) {


		String word = "apple";
		
		if(word.length()<5) {
			System.out.println("Too short!");
		}else if(word.length()>5) {
			System.out.println("Too long!");
		}else {
			System.out.println(reverseWord(word));
		}
		
	}
	
	public static String reverseWord(String word) {
		
		String str = "";
		for(int i=word.length()-1; i>=0; i--) {
			str += word.charAt(i);
		}
		
		return str;
	}

}
