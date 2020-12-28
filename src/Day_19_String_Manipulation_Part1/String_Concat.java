package Day_19_String_Manipulation_Part1;

import java.util.Scanner;

public class String_Concat {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String word=sc.nextLine();
//									-> 	->	-:
//								   |
		System.out.println(word.concat(" + Selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);			// since I didn't assign the values above to a variable
											// my word value stays same
		
		word=word.concat(" + Eclipse");		// Java + Eclipse
		System.out.println(word);
		
		word=word.concat(" Automation");	// Java + Eclipse Automation
		System.out.println(word);
		
		// word=word.concat(123);			// error, concat argument can only be String
		
		word=word.concat("123");
		System.out.println(word);	
		word+=word+456;						// word=(word+word)+456 
		System.out.println(word);			// Java + Eclipse Automation123Java + Eclipse Automation123456
		
		word=word+true;						//Java + Eclipse Automation123Java + Eclipse Automation123456true
		System.out.println(word);
		
		System.out.print("Greet please: ");
		String word2=sc.nextLine();
		word2=word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		
		
		
		
		
		
		
	}

}











