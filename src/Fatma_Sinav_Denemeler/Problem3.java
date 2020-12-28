package Fatma_Sinav_Denemeler;

public class Problem3 {

	public static void main(String[] args) {

		System.out.println(distinctCharacters("leo"));
		System.out.println(distinctCharacters("immediately"));
		System.out.println(distinctCharacters("")); 
		
	}
	
	public static int distinctCharacters(String s) {
		
		int numChar;
		String letters;
		
		if(s.length()==0 || s.equalsIgnoreCase("null")) {
			numChar = 0;
		}else {
			letters = s.charAt(0) + "";
			for(int i=1; i<s.length(); i++) {
				if(!letters.contains(s.charAt(i)+"")) {
					letters += s.charAt(i);
				}
			}
			
			numChar = letters.length();
		}
		
		return numChar;
	}


}
