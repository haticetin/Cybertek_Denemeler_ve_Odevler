package Day_16_Class_and_Objects;

public class CarObjects {

	public static void main(String[] args) {


		Car car1 = new Car();
		
		car1.printCarInfo();
		
		car1.color="black";
		car1.make="Porsche";
		car1.model="Cayenne";
		car1.currentSpeed=65;
		
		car1.printCarInfo();
		System.out.println("before : " + car1.currentSpeed);
		car1.showCurrentSpeed(120);
		car1.showCurrentSpeed(45);
		car1.accelerate(80);
		car1.drive();
		System.out.println("after :" + car1.currentSpeed);
		
	}

}
