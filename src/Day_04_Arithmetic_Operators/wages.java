package Day_04_Arithmetic_Operators;

// This program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {

		double regularWage; // The calculated regular wage
		double basePay = 25.75; // The base pay
		double regularHours = 40; // The hours worked less overtime
		double overtimeWages; // Overtime wages
		double overtimePay = 37.5; //Overtime pay rate
		double overtimeHours = 15;
		double totalWage; //Total wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overtimePay*overtimeHours;
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
	}

}
