package Assignments.Assignment08;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the buying and selling price: ");

		System.out.println(c_profits(sc.nextInt(),sc.nextInt()));
		
	}
	
	public static String c_profits(int buyPrice, int sellPrice) {
		
		String profits;
		
		if(buyPrice<sellPrice) {
			profits = "Profit";
		}else if(buyPrice>sellPrice) {
			profits = "Loss";
		}else {
			profits = "No loss";
		}
		
		return profits;
	}

}
