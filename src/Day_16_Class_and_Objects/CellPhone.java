package Day_16_Class_and_Objects;

public class CellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		switch (brand) {
		
		case "Apple":
			String calling="Calling...";
			System.out.println(calling);
			System.out.println("Face calls on " + brand + " is very good; very good sound quality");
			break;
		case "Samsung": case "Huawei":
			calling="Calling...";
			System.out.println(calling);
			System.out.println("Calls on " + brand + " is very good, since the screen is " + screenSize + " cm square large");
			break;
		default:
			System.out.println("Calls are neither good nor bad");
		}
			
		
	}
	
	public void message() {
		System.out.println(brand + " costs $" + price);
	}
	
	public void takeAphoto() {
		System.out.println(brand + " takes very good pictures");
	}

}
