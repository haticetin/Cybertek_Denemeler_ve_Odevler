package Assignments.Assignment09;

public class Q4 {

	public static void main(String[] args) {


		String word = "fifteen";
		
		System.out.println(newWord(word));
	}
	
	public static String newWord(String word) {

		String newWord = "";
		
		if(word.length()%2!=0 && word.length()>=5) {
			
			newWord = word.substring((word.length()/2)-1, (word.length()/2)+2);
			
			return newWord;
		}

		return "Invalid";
		
	}

}
