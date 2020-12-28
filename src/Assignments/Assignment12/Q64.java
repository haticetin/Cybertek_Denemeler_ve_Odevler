package Assignments.Assignment12;

import java.util.ArrayList;

public class Q64 {

	public static void main(String[] args) {

		ArrayList<String> wordList1 = new ArrayList<>();
		ArrayList<String> wordList2 = new ArrayList<>();
		
		System.out.println(combineAL(wordList1, wordList2));
		
	}
	
	public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		
		wordList1.add("Lebron");
		wordList1.add("Stephen");
		wordList1.add("Cedi");
		
		wordList2.add("Ronaldo");
		wordList2.add("Messi");
		wordList2.add("Neymar");
		wordList2.add("Salah");
		
		ArrayList<String> combination = new ArrayList<>();
		
		for(String value : wordList1) {
			combination.add(value);
		}
		
		for(String value : wordList2) {
			combination.add(value);
		}
		
		return combination;
		
	}

}
