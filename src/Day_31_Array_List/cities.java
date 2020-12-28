package Day_31_Array_List;

import java.util.ArrayList;

public class cities {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		// print each city by using for-each loop separated by space
		
		for(String value : cities) {
			System.out.println(value);
		}
		
		System.out.println("==========================");
		
		for(int i=0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
		
		System.out.println("==========================");

		
		System.out.println("Removing Baku");
		cities.remove("Baku");	// Strings are object so that's why it accepts
		cities.remove("New York");	// nothing will happen
		
		System.out.println(cities.toString());
		
		
		System.out.println("==========================");

		cities.add(0, "Arlington");
		cities.add(1, "Istanbul");
		 
		System.out.println(cities.toString());
		
		cities.add(2, "Ankara");
		
		System.out.println(cities.toString());
		
		System.out.println("==========================");

		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);
		System.out.println(cities.indexOf("Bursa"));	// any element not existing -> Output = -1
		
		System.out.println("==========================");

		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
