package Assignments.Assignment12;

public class Q60 {

	public static void main(String[] args) {


		String[][] arr = {{"f","o","o"},{" b","a","r"}};
		
		System.out.println(combineRs(arr));
		
	}
	
	public static String combineRs(String[][] arr) {
		
		String str = "";
		
		for(String[] value : arr) {
			for(String values : value) {
				str += values;
			}
		}
		
		if(Character.isDigit(str.charAt(0))) {
			str = str.replace(" ", "");
		}
		

		return str;
		
	}

}
