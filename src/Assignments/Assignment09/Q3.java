package Assignments.Assignment09;

public class Q3 {

	public static void main(String[] args) {


		String word = "cybertek";
		
		if(word.length()%2==0) {
			System.out.println(evenCharacters(word));
		}else {
			System.out.println(oddCharacters(word));
		}
		
	}
	
	public static String oddCharacters(String word) {
		
		String newWord = "";
		
		if(word.length()>=3) {
			newWord = word.charAt(word.length()/2) + "";
		}else if(word.length()==1) {
			for(int i=0; i<3; i++) {
				newWord += word;
			}
		}
		
		return newWord;
	}
	
	public static String evenCharacters(String word) {
		
		String newWord = "";
		
		if(word.length()>=4) {
			for(int i=0; i<word.length(); i++) {
				if(i==(word.length()/2)-1||i==word.length()/2) {
					newWord += word.charAt(i)+"";
				}
			}
		}else if(word.length()==2) {
			for(int i=0; i<2; i++) {
				newWord += word;
			}
		}
		
		return newWord;
	}

}
