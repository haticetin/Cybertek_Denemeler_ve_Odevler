package Day_19_String_Manipulation_Part1;

public class String_CharAt {

	public static void main(String[] args) {


		String word = "Computer";
		
		System.out.println("Total length: " + word.length());
		
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));

		/*
		 NOTE:
		 charAt() is starting index number from 0 
		 although "Computer" is 8 char., becuase of charAt() 
		 compiler counts it as 7.
		 
		
		 System.out.println(word.charAt(8));		// compilation error
	
		*/
		
		System.out.println("=========================");
		
		// Check if first char is 'A'
		
		String word2 = "Apple";
		
		if(word2.charAt(0)=='A') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		System.out.println("=========================");
		
		// Check if first and last char are same
		
		String word3 = "civic";
		
		System.out.println(word3.length());
		
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last do not match");
		}
		
		
		System.out.println("=========================");

		// last index not hard coded
		
		String word4 = "Betul Cetin";
		
		System.out.println(word4.length());
		int total=word4.length();
		int firstChar=word4.charAt(0);
		int lastChar=word4.charAt(total-1);
		
		if(firstChar==lastChar) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
		
		
	}

}
















