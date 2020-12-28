package Day_31_Array_List;

import java.util.*;

public class arrayListIntro {

	public static void main(String[] args) {

		// creating an ArrayList

		ArrayList<String> names = new ArrayList<String>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		// Assigning values to ArrayList
		
		names.add("Kubra");
		names.add("Mike");
		names.add("John");
		names.add("Smith");
		names.add("Emmy");
		names.add("Mary");
		names.add("Evan");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer ("121"));	// not so common but OK
		
		// reading from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
		System.out.println(names.toString());
		
		
		// Different type of ArrayList Creation
		ArrayList list1 = new ArrayList();		// prior to java 5
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = list2;
		ArrayList<String> list4 = new ArrayList<String>();	// prior to java 7
		ArrayList<Integer> list5 = new ArrayList<>();	// prior to java 7 and later
		List<Double> list6 = new ArrayList<>();

		list2.add("John");
		list2.add(5);
		list2.add(34.7);
		list2.add(false);
		list2.add('c');
		
		
		
		list2.forEach(x -> System.out.println(x));
		System.out.println(list3);
		System.out.println(list3.size());
		
		list2.remove(3);
		System.out.println(list3);
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
