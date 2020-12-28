package Assignments.Assignment10;

public class Q16 {

	public static void main(String[] args) {


		String word = "c#javaruby";
		String target = "java";
		
		System.out.println(javaIndex1(word, target));
		
	}
	
	public static boolean javaIndex1(String word, String target) {
		
		if(word.length()>=4) {
			if(word.indexOf(target)==0 || word.indexOf(target)==1) {
				return true;
			}
		}
		
		return false;
		
	}

}
