package Assignments.Assignment04;

public class Q10 {

	public static void main(String[] args) {


		double fatGrams, totalCalories, fatCalories, percentageCalories;
		fatGrams=80;
		totalCalories=716.8;
		
		fatCalories=fatGrams*9;
		percentageCalories=fatCalories/totalCalories;
		
		if(percentageCalories<0.3) {
			System.out.println("The food is low in fat");
		}
		if(fatCalories>totalCalories) {
			System.out.println("Input is invalid");
		}
		if(percentageCalories>0.3 && fatCalories<totalCalories) {
			System.out.println("Percentage of calories from fat: " + percentageCalories);
		}
	}

}
