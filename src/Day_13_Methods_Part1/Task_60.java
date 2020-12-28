package Day_13_Methods_Part1;

public class Task_60 {

	public static void main(String[] args) {

		calculator(21, 32, "/");
		calculator(34, 12, "-");
		calculator(63, 89, "+");
		calculator(45, 84, "*");
		calculator(44, 63, "_");
		
	}
	
	public static void calculator(double num1, double num2, String operator) {
		
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		default:
				System.out.println("Not a valid operator");
		}
	}

}
