package Week12ReviewSession;
import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {


		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("McLean");
		cities.add("Arlington");
		cities.add("Baltimore");
		cities.add("Fairfax");
		cities.add("Falls Church");
		cities.add("London");
		cities.add("Berlin");
		cities.add("Amsterdam");
		cities.add(0, "Istanbul");
		cities.add(1, "Reston");
		
		System.out.println(cities);
		
		cities.add(2, "Ankara");
		
		System.out.println(cities);
		
		// change/replace index 4 values to NewYork
		cities.set(4, "New York");
		cities.set(5, "Chicago");
		
		System.out.println(cities);
		
		// remove element value at index 3
		
		cities.remove(3);
		cities.remove("Ankara");
		
		System.out.println(cities);
		
		System.out.println("Cities count: " + cities.size());


		
		
	}

}
