package Day_05_Unary_Assignment_Relational_Operators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		byte b1= 1;
		byte b2= 2;
		double d1= 3.5;
		int i1= 17;
		float f1= (float)67.0;

		
		boolean test1 = b1<b2;
		System.out.println(test1);
		
		boolean test2= b1>b2;
		System.out.println(test2);
		
		boolean test3 = d1!=b1;  // not equal to
		System.out.println(test3);
		
		boolean test4 = (i1*f1)>=(b1*b2);
		System.out.println(test4);
		
		System.out.println((i1*f1)>=(b1*b2));
		
		System.out.println('a' > 'b'); // unicode value'ya gore cevabi veriyor
		
		// ! -> not meaning
		
	}

}
