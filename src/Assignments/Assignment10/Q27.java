package Assignments.Assignment10;

public class Q27 {

	public static void main(String[] args) {

		String main = "Certified Wooden Spoon";
		String coverMe = "o";
		
		System.out.println(coverString(main, coverMe));
		
	}
	
	public static String coverString(String main, String coverMe) {
		
		if(main.contains(coverMe)) {
			main = main.replace(coverMe, "[" + coverMe + "]");
		}else {
			main = "[" + main + "]";
		}
		
		return main;
	}

}
