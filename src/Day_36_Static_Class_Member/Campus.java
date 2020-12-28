package Day_36_Static_Class_Member;

public class Campus {

	private static String city;
	static String country;
	
//	static runs once before anything even before compiler comes to class
//	statics will run according to order
	static {
		System.out.println("Static Block-1");
		country = "USA";
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	static {
		System.out.println("Static Block-2");
		country = "UK";
	}
	
}
