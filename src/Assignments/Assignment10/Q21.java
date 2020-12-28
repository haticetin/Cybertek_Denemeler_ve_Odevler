package Assignments.Assignment10;

public class Q21 {

	public static void main(String[] args) {

		String str = "abXYabc";
		int n = 3;
		
		System.out.println(prefix(str, n));
		
	}
	
	public static boolean prefix(String str, int n) {
		
		int counter = 0;
		
		for(int i=0; i<str.length()-(n-1); i++) {
			if(str.substring(0, n).equalsIgnoreCase(str.substring(i, i+n))) {
				counter++;
			}
		}
		
		if(counter==1) {
			System.out.println(str.substring(0, n) + " appears " + "only once");
		}else if(counter==2) {
			System.out.println(str.substring(0, n) + " appears " + "twice");
		}else {
			System.out.println(str.substring(0, n) + " appears " + counter + " times");
		}
		
		if(counter==n) {
			return true;
		}
		
		return false;
	}

}
