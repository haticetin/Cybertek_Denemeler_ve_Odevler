package Day_31_Array_List;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {


		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("Paper towel");
		shoppingList.add("dish soap");	
		shoppingList.add("trash bag");
		shoppingList.add("clorox");		// camasir suyu markasi
		shoppingList.add("gloves");
		shoppingList.add("shovel");		// kurek
		
		// print numbers of items
		
		System.out.println("Shopping list has " + shoppingList.size() + " items that has to be bought");
		
		System.out.println("=======================");
		
		// print all items in single line
		
		System.out.println(shoppingList.toString());
		
		System.out.println("=======================");
		
		// print first and last item in single line
		
		System.out.print(shoppingList.get(0) + ", ");
		System.out.println(shoppingList.get(shoppingList.size()-1));
		
		shoppingList.remove("Paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		
		shoppingList.remove(0);
		
		System.out.println(shoppingList.toString());
		
		System.out.println("=======================");

		// print each item 
		
		for(String value : shoppingList) {
			System.out.println(value);
		}
		
		System.out.println("=======================");

		
		// remove all items once
		
		shoppingList.clear();
		
		System.out.println(shoppingList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
