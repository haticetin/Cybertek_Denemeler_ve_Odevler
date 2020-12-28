package Day_48_Collection_part3;

import java.util.*;

import Day_46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {


		// create set collection and add new products
		
		Set<Product> products = new HashSet<>();
		
		products.add(new Product("pen", 4.50));
		products.add(new Product("book", 15.45));
		products.add(new Product("pencil", 2.10));
		products.add(new Product("notebook", 2.54));
		products.add(new Product("mouse", 17.00));

		System.out.println(products.toString());
		
		// print each product by using for each loop
		for(Product pd : products) {
			System.out.println(pd.getPrice());
		}
		
		// print each product by using forEach method
		products.forEach(p -> System.out.println(p.getName()));
		
		
		
		
		
		
		
	}

}
