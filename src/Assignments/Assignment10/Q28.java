package Assignments.Assignment10;

public class Q28 {

	public static void main(String[] args) {


		String s1 = "one two two three";
		String s2 = "two";
		
		System.out.println(clean(s1, s2));
		
	}
	
	public static String clean(String s1, String s2) {
	
		s1 = s1.replace(s2, "");
		for(int i=0; i<s1.length(); i++) {
			if(s1.substring(i, i+1).equals(" ")) {
				s1 = s1.replace("  ", " ");
			}
		}
		s1 = s1.trim();
		
		return s1;
	}

}
