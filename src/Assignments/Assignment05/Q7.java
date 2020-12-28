package Assignments.Assignment05;

public class Q7 {

	public static void main(String[] args) {


		int num1, num2, num3;
		num1=23;
		num2=42;
		num3=32;
		
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
		System.out.println("Number 3: " + num3);

		
		if((num1<num2 && num2<num3)||(num3<num2 && num2<num1)) {
			System.out.println("Medium value is: " + num2);
		}else if((num2<num1 && num1<num3)||(num3<num1 && num1<num2)) {
			System.out.println("Medium value is: " + num1);
		}else {
			System.out.println("Medium value is: " + num3);
		}
	}

}
