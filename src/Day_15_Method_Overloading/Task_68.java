package Day_15_Method_Overloading;

public class Task_68 {

	public static void main(String[] args) {

		yearsUntilRetirement("Hatice", 1999);
		
	}
	
	public static void yearsUntilRetirement(String name, int year) {
		
		int yearsToRetire=67-calculateAge(2020,year);
		
		System.out.println(name + " retires in " + yearsToRetire + " years");
		
	}
	
	public static int calculateAge(int currentYear, int birthYear) {
		
		return currentYear-birthYear;
		
	}

}
