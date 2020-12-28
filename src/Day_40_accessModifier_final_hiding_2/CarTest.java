package Day_40_accessModifier_final_hiding_2;

import Day_40_accessModifiers_final_hiding.Car;

public class CarTest extends Car{

	public static void main(String[] args) {

		Car c = new Car();
		
//		c.model = "M3";
		c.year = 2017;
//		c.door = 4;
//		engine = 5.3;		//	?? neden olmadi
	
	}

}
