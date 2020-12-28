package Day_04_Arithmetic_Operators;

public class contribution {

	public static void main(String[] args) {


		//this program calculates the amount of pay that will be contributed to a 
		//retirement plan if  5%, 8% or 10% of monthly pay is withheld
		
		double monthlyPay= 5500;
		double contribution;
		
		contribution= monthlyPay*0.05;
		System.out.println("5 percent is $" + contribution + " per month.");
		
		contribution=monthlyPay*0.08;
		System.out.println("8 percent is $" + contribution + " per month.");
		
		contribution=monthlyPay*0.10;
		System.out.println("10 percent is $" + contribution + " per month.");

	}

}
