package Week11ReviewSession;

import java.util.Scanner;

public class RainfallTask {
	
	public static void main(String[] args) {
		
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		double[] rain = new double[12];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter in the following rainfall for the months ahead: ");
		System.out.println("Months\tRainfall(In Inches)");
		
		for(int i=0; i<months.length; i++) {
			
			System.out.println(months[i] + " : ");
			
			double value = sc.nextDouble();
			
			while(value<0) {
				System.out.println("Do not enter a negative number. Re-Enter");
			
				value = sc.nextDouble();
			}
			
			rain[i] = value;
			
		}
		
		System.out.println("The sum of all the rain is : " + getSum(rain) + " inches");
		System.out.println("The average rainfall is : "  + getAverage(rain) + " inches");
		
	}
	
	public static double getSum(double[] rain) {
		
		double sum=0;
		
		for(double value : rain) {
			 
			sum+=value;
		}
		
		sum = Math.round(sum*100.0)/100.0;
		return sum;
	}
	
	public static double getAverage(double[] rain) {
		
		return getSum(rain)/rain.length;
	}

}
