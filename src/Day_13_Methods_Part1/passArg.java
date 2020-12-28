package Day_13_Methods_Part1;

public class passArg {


	public static void main(String[] args) {


		double x=10;
		displayValue(10, 39);
		displayValue((int)x, 0);
		displayValue((int)x*4, 29);
		
	}
	
	public static void displayValue(int num2, int num1) {
		
		System.out.println("The value is " + num1);
		System.out.println("The value for num2 is " + num2);
	}
	

}
