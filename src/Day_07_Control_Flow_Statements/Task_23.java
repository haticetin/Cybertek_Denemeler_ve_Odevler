package Day_07_Control_Flow_Statements;

public class Task_23 {

	public static void main(String[] args) {

		//Q1:
		
		int y =10, x=0;
		
		if (y == 20) {
			x=5;
		}
		
		System.out.println("x = " + x + ", " + "y = " + y);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//Q2:
		
		double payRate = 1000;
		int hours = 50;
		
		if (hours > 40) {
			payRate = payRate*1.5;
		}
		
		System.out.println("Payrate is " + payRate);
		
		System.out.println("+++++++++++++++++++++++++++++++");
		
		//Q3:
		
		int fee = 20;
		boolean max = false;
		
		if (max == true) {
			fee = 50;
		}
		
		System.out.println("Fee is " + fee);
		
		System.out.println("+++++++++++++++++++++++++++++++");

		//Q4:
		
		int a, b, c;
		b = 50;
		c = 600;
		a = 15;
		
		if (c >= 100 || b == 50) {
			a = 20;
		}
		
		System.out.println("a = " + a);
		
		System.out.println("+++++++++++++++++++++++++++++++");

		//Q5:
		
		int temp = 71;
		
		if (temp >= 70 && temp <= 80) {
			System.out.println("Ideal Temperature");
			
		}
		
		
		
		
	}

}
