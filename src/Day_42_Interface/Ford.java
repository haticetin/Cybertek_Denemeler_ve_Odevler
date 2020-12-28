package Day_42_Interface;

public class Ford extends ElectricCar{
	
	private int year;

	public Ford(String model, double price, String color, int year) {
		super(model, price, color);
		this.year = year;
	}

	@Override
	public void start() {
		System.out.println("Ford - start by pressing a button...");
	}


	@Override
	public void charge() {
		System.out.println("Ford - plugin to electric outlet...");
	}


	@Override
	public void drive() {
		System.out.println("Ford is driving...");
	}


	public int getYear() {
		return year;
	}

	
	

}
