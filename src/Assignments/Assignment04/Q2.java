package Assignments.Assignment04;

public class Q2 {

	public static void main(String[] args) {


		double taxAmount=0;
		long income=39848952L;
				
		if(income>0 && income<=150000000) {
			taxAmount=income*0.25;
		}else if(income<=300000000) {
			taxAmount=37500000+((income-150000000)*0.30);
		}else if(income<=600000000) {
			taxAmount=(37500000+45000000+((income-300000000)*0.35));
		}else if(income<=1200000000) {
			taxAmount=(37500000+45000000+105000000+((income-600000000)*0.40));
		}else if(income>1200000000) {
			taxAmount=(37500000+45000000+105000000+240000000+((income-1200000000)*0.5));
		}
		
		System.out.println("Your Income: $" + income);
		System.out.println("The tax amount you have to pay: $" + taxAmount);
	}

}
