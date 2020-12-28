package Day_21_String_Manipulation_Part3;

public class String_subString {

	public static void main(String[] args) {


		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		String result = chars.substring(0, 2) + word + chars.substring(2);
		System.out.println(result);
		
		System.out.println(word.toLowerCase());	// toLowerCase doesn't accept argument
		
		System.out.println(word.toUpperCase());
		
		// Task
		
		String str = " 342 ";
		
		// display should be |342|
		
//		str = str.replace(" ", "|");
//		System.out.println(str);
		
		str = "|" + str.trim() + "|";
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
