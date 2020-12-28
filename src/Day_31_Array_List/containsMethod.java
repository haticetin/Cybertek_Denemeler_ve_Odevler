package Day_31_Array_List;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {


		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());

		ArrayList<String> list2 = list1;	// whatever we do on list2 will affect list1
											// whatever we do on list1 will affect list2
		
		System.out.println("==================================");
		
		// copy all values from list1
		
		ArrayList<String> months = new ArrayList<>(list1);	// just copied, will not affect anything

		months.add("June");
		months.add("July");
		months.add("August");
		
		System.out.println(months);
		
		System.out.println("==================================");

		System.out.println(months.contains("Jan"));
		
		System.out.println(months.contains("Dec"));

		System.out.println("==================================");

		
		// how to check if Feb is in second position
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).equals("Feb"));
		
		System.out.println("==================================");

		list1.add("Jan");
		
		System.out.println(list1);
		System.out.println(months);
		
		if(months.contains(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		
		// hocada neden output "Months has all list1" oldu???
		
		System.out.println("==================================");

		
		
		
		
		
		
		
		
		
		
	}

}
