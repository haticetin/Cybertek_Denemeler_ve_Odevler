package Day_23_Lab_Random_Class;

import java.util.*;

public class mathTutor {

	public static void main(String[] args) {


		int num1;
		int num2;
		int sum;
		int userAnswer;
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		num1 = rn.nextInt(100);
		num2 = rn.nextInt(100);
		
		System.out.println("What is the answer to the following problem?");
		
		System.out.println(num1 + "+" + num2 + " = ?");
		
		userAnswer=sc.nextInt();
		
		sum = num1 + num2;
		
		if(userAnswer==sum) {
			System.out.println("Correct, you got it :)");
		}else {
			System.out.println("Sorry, wrong answer :(");
			System.out.println("The correct answer is " + sum);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
