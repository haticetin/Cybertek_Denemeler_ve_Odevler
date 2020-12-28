package Day_08_Control_Flow_Statements_Part2;

public class Task_36 {

	public static void main(String[] args) {

		int num1=10, num2=5, result=0;
		
		String operator="/";

		switch (operator) {
		
			case "+":
				result=num1+num2;
				break;
			case "-":
				result=num1-num2;
				break;
			case "*":
				result=num1*num2;
				break;
			case "/":
				result=num1/num2;
				break;
			default:
				System.out.println("Invalid operator");
		}
		
		System.out.println("Result is " + result);
	}

}
