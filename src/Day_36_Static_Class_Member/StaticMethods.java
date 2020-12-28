package Day_36_Static_Class_Member;

public class StaticMethods {

	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
//		show2();	// BUT you CANNOT call instance method or variable from static method
		show4();	// you can call static method from static method
		System.out.println(name);	// you can call static variable from static method
//		System.out.println(age);	// you CANNOT call instance variable from static method 
	
	}
	
	public void show2() {
		show1();	// you can call static from instance method
		System.out.println(name);
		System.out.println(age);
	}

	public void show3() {
		show2();	// instance --> instance
		show1();	// instance --> static OK
	}
	public static void show4() {
	
	}

//	in static methods we CANNOT use this keyword because
//	this keyword means belongs to class
	
}
