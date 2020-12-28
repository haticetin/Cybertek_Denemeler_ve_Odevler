package Day_18_Reading_User_Input;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();		// eger int, double,... 'dan sonra String gelirse output istenildigi gibi olmuyor; sebebi nextLine'daki Line
							// sc.nextLine(); gelmek zorunda
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();		// sc.next(); skinti olmuyor
		
		System.out.println("Output: " + num1 + " : " +  num2 + " : " + str);
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
