package Assignments.Assignment04;

public class Q8 {

	public static void main(String[] args) {


		int packageQuantity=5;
		double packagePrice, discount, totalPrice;
		packagePrice=99;
		discount=0;
		totalPrice=packageQuantity*packagePrice;
		
		if(packageQuantity>=10 && packageQuantity<=19) {
			discount=packagePrice*0.20;
			totalPrice=packageQuantity*(packagePrice-discount);
			System.out.println("Amount of discount: " + discount);
			System.out.println("Total amount of purchase: " + totalPrice);
		}else if(packageQuantity>=20 && packageQuantity<=49) {
			discount=packagePrice*0.30;
			totalPrice=packageQuantity*(packagePrice-discount);
			System.out.println("Amount of discount: " + discount);
			System.out.println("Total amount of purchase: " + totalPrice);
		}else if(packageQuantity>=50 && packageQuantity<=99) {
			discount=packagePrice*0.40;
			totalPrice=packageQuantity*(packagePrice-discount);
			System.out.println("Amount of discount: " + discount);
			System.out.println("Total amount of purchase: " + totalPrice);
		}else if(packageQuantity>=100) {
			discount=packagePrice*0.50;
			totalPrice=packageQuantity*(packagePrice-discount);
			System.out.println("Amount of discount: " + discount);
			System.out.println("Total amount of purchase: " + totalPrice);
		}else {
			System.out.println("No discount");
			System.out.println("Total amount of purchase: " + totalPrice);
		}
	}
}	
	