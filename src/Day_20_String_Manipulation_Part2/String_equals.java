package Day_20_String_Manipulation_Part2;

public class String_equals {

	public static void main(String[] args) {


		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to C++";

		boolean b1 = s1.equals(s2);	// true if objects are equal
		boolean b2 = s1.equals(s3);
		System.out.println(b1 +  "|" + b2);
		
		boolean b3 = s1==s2;	// true if reference variables are referring to same objects
		boolean b4 = s1==s3;
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("welcome to java");
		
		boolean b5 = s1.equalsIgnoreCase(s4);	// doesn't care capital or small letters
												// but cares space
		System.out.println(b5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
