package Day_36_Static_Class_Member;

public class Calculator {

	public static double plus(double num1, double num2) {
		return num1+num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	
	public static double multiply(double num1, double num2) {	// --> utility method
		return num1*num2;										// based on the parameter 
																// doesnt depend on anything just parameter
	}
	
	// if there is an instance variable -> method should be instance method
	// if there is no instance variable -> method should be static method

}
