package Assignments.Assignment04;

public class Q13 {

	public static void main(String[] args) {


		double bankServiceFees, numberOfChecks, baseFee;
		baseFee=10;
		numberOfChecks=0;
		bankServiceFees=0;
		
		if(numberOfChecks>0 && numberOfChecks<20) {
			bankServiceFees=baseFee+(0.1*numberOfChecks);
		}else if(numberOfChecks>=20 && numberOfChecks<=39) {
			bankServiceFees=baseFee+(0.08*numberOfChecks);
		}else if(numberOfChecks>=40 && numberOfChecks<=59) {
			bankServiceFees=baseFee+(0.06*numberOfChecks);
		}else if(numberOfChecks>=60) {
			bankServiceFees=baseFee+(0.04*numberOfChecks);
		}else if(numberOfChecks==0) {
			bankServiceFees=baseFee;
		}else {
			System.out.println("Not a valid number of checks");
		}
		
		System.out.println("The bank's service fees for the month: $" + bankServiceFees);
	}

}
