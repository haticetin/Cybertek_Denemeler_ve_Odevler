package Week10ReviewSession;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) {


		String word = "java";
		
		char[] letters = word.toCharArray();
		
		System.out.println(letters.length);
		
		for(char l : letters) {
			System.out.println(l);
		}
		
		Arrays.parallelSort(letters);
		
		System.out.println(Arrays.toString(letters));
		
		// after sorting, create a new String with that value of array
		
		String sorted = new String(letters);
		System.out.println(sorted);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
