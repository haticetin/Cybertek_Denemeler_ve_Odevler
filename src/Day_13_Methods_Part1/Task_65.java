package Day_13_Methods_Part1;

public class Task_65 {

	public static void main(String[] args) {

		grade(90, 89, 98);
		grade(54, 33, 38);
		
	}
	
	public static void grade(int grade1, int grade2, int grade3) {
		
		int average=(grade1+grade2+grade3)/3;
		
		if(average>=90 && average<=100) {
			System.out.println("Grade: A");
			System.out.println("Congrats");
		}else if(average>=80 && average<=89) {
			System.out.println("Grade: B");
		}else if(average>=70 && average<=79) {
			System.out.println("Grade: C");
		}else if(average>=60 && average<=69) {
			System.out.println("Grade: D");
		}else if(average>=0 && average<=59) {
			System.out.println("Grade: F");
			System.out.println("Failed!");
		}else {
			System.out.println("Invalid Grade");
		}
	}

}
