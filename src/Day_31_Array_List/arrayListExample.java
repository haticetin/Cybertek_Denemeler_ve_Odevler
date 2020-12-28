package Day_31_Array_List;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {

		// languages
		// print size arrayList
		// read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Turkish");
		languages.add("English");
		languages.add("Croatian");
		languages.add("German");
		languages.add("Serbian");
		languages.add("Bosnian");
		languages.add("Uzbek");
		languages.add("Russian");
		
		System.out.println(languages.get(5));
		System.out.println(languages.get(7));
		System.out.println(languages.get(3));
		System.out.println(languages.get(0));
		System.out.println(languages.get(1));
		System.out.println(languages.get(languages.size()-1));
		
		System.out.println("Size of language ArrayList : " + languages.size());
		System.out.println(languages.toString());
		
		languages.add("Java");

		System.out.println(languages.toString());
		
		languages.remove(7);
		languages.add("English");
		
		System.out.println(languages.toString());
		
		languages.remove(languages.size()-1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
