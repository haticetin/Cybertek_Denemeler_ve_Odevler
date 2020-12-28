package Day_05_Unary_Assignment_Relational_Operators;

public class mixedInteger {

	public static void main(String[] args) {


		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		
		int res1 = i1 + i2;
		//float res2 = i1 + f1;
		double res3 = i2 + d1;
		double res4 = f1 + d1;
		
		byte b1=20;
		byte b2=2;
		
		int b3 = b1*b2;
		byte b4 = (byte)(b1*b2);
		System.out.println(b3 + ", " + b4);
		
		int a1 = 126;
		int a2 = 1;
		byte res = (byte)(a1 + a2); // casting is required
		byte res2 = 126 + 1; // no casting is required, if its out of range then you need to cast it.
		System.out.println(res + " " + res2);
		
		System.out.println(2*5*(4-5)*(-8+3)/4);
		System.out.println(4/3); 
		

	}

}
