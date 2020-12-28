package Day_04_Arithmetic_Operators;

public class additionConcat {

	public static void main(String[] args) {

		// number + number = addition
		System.out.println(2*2);
		System.out.println(20+200);
		
		// number + string = concatenation
		System.out.println(5 + "Hello");
	
		// String + Boolean = Concatenation
		System.out.println("hello" + true);
		
		// string + string = concatenation
		System.out.println("hello" + "hello");
		
		//boolean + number & number + boolean
		//System.out.println(true + 6);   ERROR
		//System.out.println(6+true);     ERROR
		
		
		System.out.println((2+0+3+"Cybertek")); // iki parantezin olmasi bisey degistirmiyor. Silinedebilir.
		System.out.println("Cybertek" +2+0+5); // String+number->String		Sirayla gitmek gerekiyor.
		System.out.println(2+0+5+"Cybertek"+2+0+5);
		System.out.println(2+0+5+"Cybertek"+(2+0+1));
		
		
		
	}

}
