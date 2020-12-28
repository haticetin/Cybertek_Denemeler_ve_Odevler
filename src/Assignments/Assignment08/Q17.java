package Assignments.Assignment08;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Is galacticly popular drink available at the store? ");
		boolean available=sc.nextBoolean();
		System.out.print("You got it as a gift: ");
		boolean gift=sc.nextBoolean();
		System.out.print("How much did you put from ingredient 1: ");
		int ingredient1=sc.nextInt();
		System.out.print("How much did you put from ingredient 2: ");
		int ingredient2=sc.nextInt();
		System.out.print("How much did you put from ingredient 3: ");
		int ingredient3=sc.nextInt();

		System.out.println(getThunderBlazz(available, gift, ingredient1, ingredient2, ingredient3));
		
	}
	
	public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1 , int ingredient2, int ingredient3) {
		
		boolean OK;
		
		OK = (available)?true:(gift)?true:((ingredient1==1 && ingredient2==2 && ingredient3==3)
				||(ingredient1==3 && ingredient2==1 && ingredient3==2))?true:false;
		
		return OK;
				
	}

}
