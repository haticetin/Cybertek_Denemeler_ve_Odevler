package Day_33_ClassObjects_constructors;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	
	
//	create constructor
	public Car() {
		
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile = 5000;
		color = "red";
	}
	
//	public Car(String model, String make, int year, double mile, String color) {
//		
//		model = model; 	// bizim class manasina geliyor
//		make = make;
//		year = year;
//		mile = mile;
//		color = color;
//		
//	}

	public Car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;		// means belongs to this class
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	
	
	

}
