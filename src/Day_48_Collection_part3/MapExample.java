package Day_48_Collection_part3;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>();
		list.add(10);
		
		
		Map<String, Double> item = new HashMap<>();
		item.put("Apple", 3.49);
		item.put("Flowers", 10.99);
		item.put("Eggs", 4.99);
		item.put("Milk", 6.0);
		item.put("Cherries", 5.99);
		item.put("Apple", 5.49);
		
		System.out.println(item.size());
		
		System.out.println(item.toString());
		
		System.out.println(item.isEmpty());
		
		System.out.println(item.get("Apple"));
		System.out.println(item.get("Milk"));
		
		item.remove("Flowers");
		
		System.out.println(item.toString());
		
		System.out.println("Is Apple there? " + item.containsKey("Apple"));
		System.out.println("Is Flower there?" + item.containsKey("Flowers"));
		
		item.replace("Eggs", 3.5);
		System.out.println("Price of Eggs:" + item.get("Eggs"));
		
		item.put("Milk", 2.6);
		System.out.println("Price of Milk:" + item.get("Milk"));
		
		// increase price of cherries by $2
		item.replace("Cherries", item.get("Cherries")+2);
		System.out.println("Price of Cherries: " + item.get("Cherries"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
