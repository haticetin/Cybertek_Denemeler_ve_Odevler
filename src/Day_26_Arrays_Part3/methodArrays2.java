package Day_26_Arrays_Part3;

import java.util.Scanner;

public class methodArrays2 {

	public static void main(String[] args) {


		// createArray will accept one parameter which is carSize
		// user will enter some cars
		
		
		// findCar method - will accept 2 parameters which is 1- int value, toFindCar
		// if car is found - return true
		// if not - return false
		
		System.out.println(findCar(3, "Porsche"));
		
	}
	
	public static String[] createArray(int carSize) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] cars = new String[carSize];
		
		System.out.println("Please enter a series of " + carSize + " car brands : ");
		
		for(int i=0; i<cars.length; i++) {
			
			System.out.print("Car " + (i+1) + " : ");
			
			cars[i]=sc.nextLine();
			
		}
		
		return cars;
		
	}
	
	public static boolean findCar(int size, String toFindCar) {
					
		for(String car : createArray(size)) {	
			
			if(car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
		}	
		
		
//		String[] y = createArray(size);
//		
//		for(int i=0;i<y.length;i++) {
//			
//			if(y[i].equalsIgnoreCase(toFindCar)) {
//				return true;
//			}
//		} 
		
		return false;
	}

}















