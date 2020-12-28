package Week11ReviewSession;

public class EncryptedString {

	public static void main(String[] args) {


		//create a method that accepts a string and return encryted string		   
		//java - qzez
		  
		System.out.println(encrypted("cybertek"));  
		  
		 
	}
	
	public static String encrypted(String word) {
		
		 String alphabet = "abcdefghijklmnopqrstuvwxyz";
		 String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		 
		 String encWord = "";
		 for(int i=0; i<word.length(); i++) {
			 
			 char myLetter = word.charAt(i);
			 int indexLet = alphabet.indexOf(myLetter);
			 char dec = encrypted.charAt(indexLet);
			 
			 encWord += dec;
		 }
		 
		 return encWord;
	}

}
