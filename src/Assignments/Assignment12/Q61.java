package Assignments.Assignment12;

import java.util.ArrayList;

public class Q61 {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>(3);
		
		System.out.println(method(words));
		
	}
	
	public static ArrayList<String> method(ArrayList<String> words){
		
		words.add("java");
		words.add("python");
		words.add("JavaScript");
		words.add("C++");
		words.add("C#");
		words.add("HTML");
		
		words.set(0, "git");
		words.set(2, "gud");
		
		
		return words;
		
	}

}
