package Assignments.Assignment08;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount of water you used: ");
		
		System.out.println(calcWaterBill(sc.nextDouble()));
		
	}
	
	public static double calcWaterBill(double unit) {
		
		double bill;
		
		if(unit<=50) {
			bill=unit*0.60;
		}else if(unit>50 && unit<=100) {
			bill=unit*0.90;
		}else if(unit>100 && unit<=150){
			bill=(unit*0.90)+50;
		}else if(unit>150) {
			bill=(unit*0.90)+100;
		}else {
			bill=0;
		}
		
		return bill;
		
		
	}

}
