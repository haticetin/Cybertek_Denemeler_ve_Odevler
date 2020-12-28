package Lab.Lab2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many cookies did you eat?");
		
		
		System.out.println("Calories: " + calcCalories(sc.nextInt()));

	}
	
	public static int calcCalories(int cookiesEaten) {
		
		int bagOfCookies=40;
		int cookiesPerServing=bagOfCookies/10;
		int caloriesPerCookies=300/cookiesPerServing;
		int calories=cookiesEaten*caloriesPerCookies;
		
		return calories;
	}

}
