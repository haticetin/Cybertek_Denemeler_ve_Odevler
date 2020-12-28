package Day_33_ClassObjects_constructors;

public class CarTest {

	public static void main(String[] args) {


		Car c1 = new Car();
		
//		1- new -> call constructor
//		2- which constructor
//		3- constructor with no parameter in Car class -> default constructor
		
		Car c2 = new Car("Honda", "Civic", 2020, 5000, "red");
		Car c3 = new Car("BMW", "320", 2017, 30000, "red");
		
		System.out.println(c1.make);
		System.out.println(c1.make);
		
		
		
		
		
		
	}

}
