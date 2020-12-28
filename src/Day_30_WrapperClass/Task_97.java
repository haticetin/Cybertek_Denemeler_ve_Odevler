package Day_30_WrapperClass;

import java.util.Arrays;

public class Task_97 {

	public static void main(String[] args) {


		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(welcomeToCoreJava(str));
	}
	
	public static String welcomeToCoreJava(String s) {
		
//		Efficient Way
		
		String str = "";
		
		for(int i=0; i<s.length(); i++) {
			
			if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' ') {
				str+=s.charAt(i);
				
			}
		}
		
//		Inefficient Way
		
//		str = str.replace("(", "").replace("&", "").replace("*", "").replace("_", "");
//		
//		str = str.replace("73", "").replace("%", "").replace("@", "").replace(">", "");
//		
//		str = str.replace(",", "").replace("$", "").replace("<", "").replace("`", "");
//		
//		str = str.replace("!", "").replace("777.||}{", "").replace("~", "");
		
		
		
		return str;
		
	}

}






