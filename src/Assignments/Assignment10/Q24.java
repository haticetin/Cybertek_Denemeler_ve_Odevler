package Assignments.Assignment10;

public class Q24 {

	public static void main(String[] args) {
		
		String str = "We study java not python";
		
		System.out.println(java_python(str));
		
	}
	
	public static boolean java_python(String str) {
		
		String target1 = "java";
		String target2 = "python";
		int counterJava = 0;
		int counterPython = 0;
		
		for(int i=0; i<str.length()-3; i++) {
			if(str.substring(i, i+4).equalsIgnoreCase(target1)) {
				counterJava++;
			}
		}
		
		for(int i=0; i<str.length()-5; i++) {
			if(str.substring(i, i+6).equalsIgnoreCase(target2)) {
				counterPython++;
			}
		}
		
		if(counterJava==counterPython) {
			return true;
		}
		
		return false;
		
	}

}
