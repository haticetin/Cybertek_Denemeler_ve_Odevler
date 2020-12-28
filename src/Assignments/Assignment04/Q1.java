package Assignments.Assignment04;

public class Q1 {

	public static void main(String[] args) {

		int massInPounds, heightInFeet, heightInches, heightInInches;
		double massInKg, heightInMeter, BMI;
		massInPounds=115;
		System.out.println("Your weight in pounds: " + massInPounds);
		heightInFeet=5;
		heightInches=3;
		heightInInches=(heightInFeet*12)+heightInches;	
		System.out.println("Your height in feet and inches: " + heightInFeet + " " + heightInches);
		
		massInKg=massInPounds/2.2;
		heightInMeter=heightInInches*0.0254;
		BMI=massInKg/(heightInMeter*heightInMeter);
		System.out.println("Your BMI: " + BMI);
		
		
		if (BMI<18.5) {
			System.out.println("Your risk factory is Underweight");
		}else if(BMI>=18.5 && BMI<25) {
			System.out.println("You don't have a risk");
			System.out.println("Normal Weight");
		}else if(BMI>=25 && BMI<30) {
			System.out.println("Your risk factory is Overweight");
		}else if(BMI>=30) {
			System.out.println("Your risk factory is Obese!");
		}
		
		
		
		
	}

}
