package Day_20_String_Manipulation_Part2;

public class String_replace {

	public static void main(String[] args) {


		String str = "Istanbul is the capital of Ottoman of Ottoman";	
										// if there is 2 same word, both are changed
		System.out.println(str);
		
		str = str.replace("Istanbul", "Ankara").replace("Ottoman", "Turkey");
		
		System.out.println(str);
		
		String email = "firstname_lastname@gmail.com";
		
		String company = "capitalone";
		
		String newEmail = email.replace("gmail", company);
		
		System.out.println(newEmail);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
