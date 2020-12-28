package Day_08_Control_Flow_Statements_Part2;

public class smallTasks {

	public static void main(String[] args) {


		int x, y;
		x=248;
		y=98;
		
		if (x>100) {
			y=20;
		}else {
			y=0;
		}
		System.out.println("y = " + y);
		
		if(y==100) {
			x=1;
		}else {
			x=0;
		}
	
		System.out.println("x = " + x);
		
		int a=33, b=21, c=89;
	
		if (a<10) {
			b=0;
			c=1;
		}else {
			b=-99;
			c=0;
		}
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	
		int num1, num2;
		num1=37;
		num2=28;
		
		if(num1>num2) {
			System.out.println("Num1: " + num1 + " is greater than " + "Num2: " + num2);
		}else {
			System.out.println("Num2: " + num2 + " is greater than " + "Num1: " + num1);
		}
		
		int d=3719;
		
		if (d%2==0) {
			System.out.println("The number " + d + " is an even number");
		}else {
			System.out.println("The number " + d + " is an odd number");
		}
		
		
		if ((a+b+c)==180) {
			System.out.println("The triangle is valid");
		}else {
			System.out.println("The triangle is not valid");
		}
		
		
	
	
	
	
	
	
	
	}
	

}
