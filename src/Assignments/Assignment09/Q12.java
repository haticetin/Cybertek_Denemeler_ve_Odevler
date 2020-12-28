package Assignments.Assignment09;

public class Q12 {

	public static void main(String[] args) {


		String str = " xHiX";
		str = str.trim();
		
		if(str.startsWith("x")||str.startsWith("X")) {
			str = str.substring(1,str.length());
		}
		if(str.endsWith("x")||str.endsWith("X")){
			str = str.substring(0, str.length()-1);
		}
		
		System.out.println(str);
		
	}

}
