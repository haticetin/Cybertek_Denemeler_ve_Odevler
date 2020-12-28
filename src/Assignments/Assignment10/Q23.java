package Assignments.Assignment10;

public class Q23 {

	public static void main(String[] args) {


		String sandwich = "breadbutterbread";
		
		System.out.println(sandwich(sandwich));
		
	}
	
	public static String sandwich(String sandwich) {
		
		String target = "bread";
		int firstIndex = sandwich.indexOf(target)+5;
		int lastIndex = sandwich.lastIndexOf(target);
		int counter = 0;
		
		for(int i=0; i<sandwich.length()-4; i++) {
			if(sandwich.substring(i, i+5).equalsIgnoreCase(target)) {
				counter++;
			}
		}
		
		if(counter==2) {
			return sandwich.substring(firstIndex, lastIndex);
		}
		
		return "nothing";
	}

}
