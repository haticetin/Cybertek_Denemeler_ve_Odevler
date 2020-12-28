package Day_15_Method_Overloading;

public class Task_71 {

	public static void main(String[] args) {
		
		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(-10, 0);
		calcFeetAndInchesToCentimeters(0, 1);
		
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet<0 || inches<0 || inches>12) {
			System.out.println("Invalid feet or inches");
			return -1;
		}

		double centimeters=((feet*12)+inches)*2.54;
		
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");
		
		return centimeters;
		
	}
	
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if(inches<0) {
			System.out.println("Invalid inches");
			return -1;
		}
		
		double feet=(int)inches/12;
		double remainInches=inches%12;
		
		System.out.println(inches + " inches = " + feet + " feet and " + remainInches + " Inches");
		
		return calcFeetAndInchesToCentimeters(feet, remainInches);
		
		}

}





















