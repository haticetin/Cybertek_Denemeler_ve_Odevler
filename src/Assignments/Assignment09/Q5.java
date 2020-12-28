package Assignments.Assignment09;

public class Q5 {

	public static void main(String[] args) {


		String word1 = "jaa";
		String word2 = "wow";
		
		if(word1.length()==3 && word2.length()==3) {
			System.out.println(mergeWords(word1, word2));
		}else {
			System.out.println("Cannot merge");
		}
		
	}
	
	public static String mergeWords(String word1, String word2) {
		
		String newWord = "";
		
		for(int i=0; i<word1.length(); i++) {
			newWord += word1.substring(i,i+1) + word2.substring(i,i+1);
		}
		
		return newWord;
		
	}

}
