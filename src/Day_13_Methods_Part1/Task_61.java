package Day_13_Methods_Part1;

public class Task_61 {

	public static void main(String[] args) {

		age(2020, 1999);
		
	}
	
	public static void age(int currentYear, int birthYear) {
		int age=currentYear-birthYear;
		System.out.println("Your age = " + age);
	}

}
