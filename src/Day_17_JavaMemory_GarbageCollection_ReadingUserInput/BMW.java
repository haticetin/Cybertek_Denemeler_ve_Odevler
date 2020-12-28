package Day_17_JavaMemory_GarbageCollection_ReadingUserInput;

public class BMW {
	
	String make="BMW";		// default -> BMW
	String model;
	double price;
	
	public double showPrice() {
		
		switch (model) {
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default:
			System.out.println(model + " is not available");
			price=0;
			
		}
		System.out.println("Price: " + price);
		return price;
		
		
	}
		
}
