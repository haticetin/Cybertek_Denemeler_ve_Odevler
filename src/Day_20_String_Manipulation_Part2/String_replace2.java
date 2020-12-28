package Day_20_String_Manipulation_Part2;

public class String_replace2 {

	public static void main(String[] args) {


		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpace = sentence.replace(" ", "");
		
		System.out.println(withNoSpace);
		
		System.out.println(sentence);
		
		// replace , with !!
		
		String newSentence = sentence.replace(",", "!!");
		
		System.out.println(newSentence);
		
		String mixed = "%*((j$a-v|a#@$";
		
		mixed = mixed.replace("%*((","");
		System.out.println(mixed);
		mixed = mixed.replace("#@$","");
		System.out.println(mixed);
		mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);
		
		String result = "Yaklasık 11.020.000.000 sonuc bulundu (0,50 saniye)";
	
		result = result.replace("Yaklasık ", "").replace(" sonuc bulundu (0,50 saniye)", "");
		
		System.out.println(result);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
