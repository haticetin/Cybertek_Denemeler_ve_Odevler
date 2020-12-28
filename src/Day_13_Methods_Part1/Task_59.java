package Day_13_Methods_Part1;

public class Task_59 {

	public static void main(String[] args) {

		pay(160, 12.5);
		pay(45.20, 35.45);
	}
	
	public static void pay(double numHours, double payRate) {
		double pay=numHours*payRate;
		System.out.println("Pay = $" + pay);
	}

}
