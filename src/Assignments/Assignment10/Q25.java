package Assignments.Assignment10;

public class Q25 {

	public static void main(String[] args) {


		String s1 = "java";
		String s2 = "selenium";
		
		System.out.println(mergeStrings(s1, s2));
		
	}
	
	public static String mergeStrings(String s1, String s2) {
		
		String str = "";
	    
		for(int i=0; i<s1.length() || i<s2.length(); i++) {
			
			if(i<s1.length()) {
				str += s1.charAt(i);
			}
			
			if(i<s2.length()) {
				str += s2.charAt(i);
			}
		}
	
		return str;
		
	}

}
