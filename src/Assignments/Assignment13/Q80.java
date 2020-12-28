package Assignments.Assignment13;

public class Q80 {

	public static void main(String[] args) {


		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		
		printCenturies(scores);
		
	}
	
	public static void printCenturies(short[] scores) {
		
		int half_centuries=0, centuries=0, double_centuries=0;
		
		for(short value : scores) {
			if(value>=50 && value<100) {
				half_centuries++;
			}else if(value>=100 && value<200) {
				centuries++;
			}else if(value>=200) {
				double_centuries++;
			}
		}
		
		System.out.println("Half-Centuries : " + half_centuries);
		System.out.println("Centuries : " + centuries);
		System.out.println("Double-Centuries : " + double_centuries);
			
		
	}

}
