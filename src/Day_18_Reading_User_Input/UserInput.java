package Day_18_Reading_User_Input;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a byte value: ");
		
		byte num = sc.nextByte();
		
		System.out.println(num%10);
		
		System.out.print("Enter a short value: ");
		
		short num2 = sc.nextShort();
		
		System.out.println(num2%2);
		
		System.out.print("Enter a int value: ");
		
		int num3 = sc.nextInt();
		
		System.out.println(num3%3);
		
		System.out.print("Enter a long value: ");
		
		long num4 = sc.nextLong();
		
		System.out.println(num4%4);
		
		System.out.print("Enter a float value: ");
		
		float num5 = sc.nextFloat();
		
		System.out.println(num5/5);
		
		System.out.print("Enter a double value: ");
		
		double num6 = sc.nextDouble();
		
		System.out.println(num6/6);
		
		System.out.print("Enter a boolean value: ");
		
		boolean bool = sc.nextBoolean();
	
		System.out.println(bool);
		
		System.out.print("Enter your name please: ");
		
		sc.nextLine();
		
		String name = sc.nextLine();
		
		System.out.println(name + "\n Wow, what a beautiful name");
		
		
	}

}
