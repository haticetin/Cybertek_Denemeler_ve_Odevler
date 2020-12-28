package Assignments.Assignment12;

import java.util.ArrayList;

public class Q65 {

	public static void main(String[] args) {

		ArrayList<String> wordList = new ArrayList<>();
		String targetWord = "tomato";
		
		removeAll(wordList, targetWord);
		
	}
	
	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		
		wordList.add("apple");
		wordList.add("tomato");
		wordList.add("potato");
		wordList.add("tomato");
		wordList.add("cucumber");
		wordList.add("milk");
		wordList.add("tomato");
		wordList.add("bread");
		
		while(wordList.contains(targetWord)) {
			removing(wordList, targetWord);
		}
		
		System.out.println(wordList);
		
	}
	
	public static ArrayList<String> removing(ArrayList<String> wordList, String targetWord){
		
		for(String value : wordList) {
			if(value.equalsIgnoreCase(targetWord)) {
				wordList.remove(value);
				break;
			}
		}
		
		return wordList;
		
	}

}
