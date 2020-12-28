package Day_36_Static_Class_Member;

public class CalculatorTest {

	public static void main(String[] args) {


		double result = Calculator.plus(55, 7);	// if method is static you can call directly with classname
		System.out.println("Result:" + result);
		
		Calculator c = new Calculator();
		
		System.out.println("Result:" + c.plus(55, 7));
		
		int i = Integer.parseInt("2");

//		1.
		CalculatorTest.m1();
		
//		2.
		m1();
		
//		3.
		CalculatorTest C1 = new CalculatorTest();
		C1.m1();
		
		
	}
	
	public static void m1() {
		System.out.println("hello");
	}

}
