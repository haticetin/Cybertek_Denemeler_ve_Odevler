package Assignments.Assignment10;

public class Q19 {

	public static void main(String[] args) {
		
		String str = "javaxjavaapplepearjavaegg";

		System.out.println(numOfJava(str));
		
	}
	
	public static int numOfJava(String str) {
		
		String target = "java";
		int counter = 0;
		
		for(int i=0; i<str.length()-3; i++) {
			if(str.substring(i, i+4).equalsIgnoreCase(target)) {
				counter++;
			}
		}
		
		return counter;
	}

}
