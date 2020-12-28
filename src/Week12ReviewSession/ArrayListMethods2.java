package Week12ReviewSession;
import java.util.ArrayList;

public class ArrayListMethods2 {

	public static void main(String[] args) {

		// isEmpty, contains, indexOf, clear
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		// check if list is empty
		
		System.out.println("shopping list is empty: " + shoppingList.isEmpty());
		System.out.println("Size of shopping list: " + (shoppingList.size()==0));

		if(shoppingList.isEmpty()) {
			System.out.println("List is empty, nothing to buy.");
		}else {
			System.out.println("List is not empty.");
		}
	
		shoppingList.add("Laptop");
		shoppingList.add("Pen");
		shoppingList.add("Pencil");
		shoppingList.add("Book");
		shoppingList.add("TV");

	
		if(shoppingList.isEmpty()) {
			System.out.println("List is empty, nothing to buy.");
		}else {
			System.out.println("List is not empty.");
		}
		
		// check if pencil is among the items
		
		System.out.println("list contains - pencil : " + shoppingList.contains("Pencil"));
	
		System.out.println("5 in the list: " + shoppingList.contains("5"));
		
		// find the indexOf Laptop, Book
		
		System.out.println("Laptop index: " + shoppingList.indexOf("Laptop"));
		System.out.println("Book index: " + shoppingList.indexOf("Book"));
		
		// remove everything
		
		shoppingList.clear();
		
		System.out.println(shoppingList);
		
		
		
		
		
		
		
		
		
		
		
	}

}
