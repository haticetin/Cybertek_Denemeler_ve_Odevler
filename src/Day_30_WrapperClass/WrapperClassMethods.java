package Day_30_WrapperClass;

public class WrapperClassMethods {

	public static void main(String[] args) {


		System.out.println("Min value byte : " + Byte.MIN_VALUE);
		System.out.println("Max value byte : " + Byte.MAX_VALUE);
		
		System.out.println("Min value int : " + Integer.MIN_VALUE);
		System.out.println("Max value int : " + Integer.MAX_VALUE);
		
		System.out.println("Max value char : " + Character.MAX_VALUE);
		System.out.println("Min value char : " + Character.MIN_VALUE);
		System.out.println();
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isAlphabetic('#'));
		System.out.println();
		
		System.out.println(Character.isLetter('j'));
		System.out.println(Character.isLetter('&'));
		System.out.println();
		
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('P'));
		System.out.println();
		
		String word = "java101";
		System.out.println(Character.isAlphabetic(word.charAt(0)));
		System.out.println(Character.isDigit(word.charAt(6)));
		
		System.out.println(Double.isNaN(1.0/0));	// isNaN() returns true if value is not a number
													// value is Infinity
													// any decimal divided by 0 
													
		System.out.println(Double.isNaN(0.0/0.0));	// 0.0 divided by 0.0 => NaN
		
//		System.out.println(Double.isNaN(0/0));		// ArithmeticException
		
		System.out.println(Double.isNaN(1/0.0));	// value is Infinity
													// any number divided by 0.0
		
		System.out.println(Integer.compare(1, 39));	// returns 1 if first object is greater than second
													// returns 0 if objects are equal
													// returns -1 if first object is less than second object
		
		Integer n1 = 234;
		Integer n2 = 234;
		Integer n3 = n1;
		
		if(n1==n2) {
			System.out.println("A");
		}else if (n1.equals(n2)) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		if(n1.equals(n3)) 
			System.out.println("Q");
		else if(n1==n3) {
			System.out.println("R");
		}else {
			System.out.println("S");
		}
		
		
//		== isareti objelerin referanslari ayni mi diye bakiyor
//		equals() metodu objelerin degerleri ayni mi diye bakiyor
		
//		eger objelerin referanslari ayniysa equals() metodu da == isareti de calisir
//		if statementta hangisi daha onceyse o secilir
		
		
//		Special case (i1 == i2)
		
//		A)
		Integer i1 = 128;
		Integer i2 = 128;
		
//		B)
		i1 = 127;
		i2 = 127;

//		C)
		Integer i = new Integer(127);
		i1 = i;
		i2 = 127;
		
		if(i1==i2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
//		A da false cikarticak
//		B de true cikarticak
//		C de true cikarticak
		
		// if the wrapper classes are created literally
		// and if they are autoboxed 
		// and if they are between these ranges 
		// i1 == i2 will return true
		
		/*
		 * int	 	==>		-128 --> 127
		 * short	==>		-128 --> 127
		 * byte		==>		-128 --> 127
		 * char		==>		corresponding ascii value 0-256
		 * boolean	==>		true, false
		 */

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
