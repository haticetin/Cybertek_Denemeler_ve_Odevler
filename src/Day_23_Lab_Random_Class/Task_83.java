package Day_23_Lab_Random_Class;

import java.util.*;

public class Task_83 {

	public static void main(String[] args) {


		int num1;
		int num2;
		String yesNo="";
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		
		do {
			
			System.out.println("rolling the dice...");
			num1 = rn.nextInt(6)+1;
			num2 = rn.nextInt(6)+1;
			System.out.println("Their values are: " + num1 + " " + num2);
			System.out.print("Roll them again? (yes=Y/y) (no=N/n) : ");
			yesNo = sc.next();
			
		}while(yesNo.equalsIgnoreCase("y"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
