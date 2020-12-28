package Day_24_Arrays_Part_1;

public class Task_90 {

	public static void main(String[] args) {


		String[] cars = {"Honda", "BMW", "Mercedes", "Toyota", "Opel", "Volkswagen", "Porsche", "Range Rover", 
				"Chevrolet", "Skoda", "Hyundai", "Peugeot", "Renault", "Audi", "Mitsubishi", "Rolls Royce", "Ferrari",
				"Lamborghini", "Citroen", "Ford", "Fiat", "Smart", "Jaguar", "Mini", "Suzuki", "Kia", "Nissan", "Volvo",
				"Jeep", "Lexus"};
		
		String targetCar = "Range Rover";
		String message = "I couldn't find your car " + targetCar + " in this array.";
		
		for(int i=0; i<cars.length; i++) {
			if(cars[i].equalsIgnoreCase(targetCar)) {
				message = "I found your car " + targetCar + " in this array.";
				break;
			}
		}
		
		System.out.println(message);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
