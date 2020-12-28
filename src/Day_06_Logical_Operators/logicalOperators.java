package Day_06_Logical_Operators;

public class logicalOperators {

	public static void main(String[] args) {

		char c1='A';
		char c2=65;
		int i1=5;
		int i2=10;
		
		boolean res1 = (i1==i2)&(c1==c2); // F & T = F
		boolean res2 = (i1==i2)&&(c1==c2); //F && --- => F
		System.out.println("res2 = " + res2);
		
		boolean res3 = (i1==i2)&&(c1==c2++); // when there is && twice and sign the compiler will check first and if its false
											 // it wont evaluate the second so c2++ is not going to be evaluated therefore 
											 // the result will remain same
		
		
		System.out.println(c2); // 65->A
		
		boolean res4 = (c1==c2)|(i1==i2); // T | F => T
		System.out.println("res4 = " + res4);
		
		boolean res5 = (c1==c2)||(i1==i2); //T || --- => T
		System.out.println("res5 = " + res5);
		
		boolean res6 = (c1==c2)^(i1==i2); // T ^ F => T
		System.out.println("res6 = " + res6);
		
		boolean res7 = (c1==c2)^(i1!=i2); // T ^ T => F
		System.out.println("res7 = " + res7);
		
		
	}

}
