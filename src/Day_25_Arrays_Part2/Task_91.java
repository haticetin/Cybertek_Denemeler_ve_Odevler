package Day_25_Arrays_Part2;

import java.util.Random;

public class Task_91 {

	public static void main(String[] args) {

		Random rn = new Random();
		
		int[] myList={rn.nextInt(100),rn.nextInt(100),rn.nextInt(100),rn.nextInt(100),rn.nextInt(100),
				rn.nextInt(100),rn.nextInt(100),rn.nextInt(100),rn.nextInt(100),rn.nextInt(100)};
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		////////////////// OR ////////////////////////
		
		boolean[] words;
		words = new boolean[10];
		
		for(int i=0; i<words.length; i++) {
			words[i]=rn.nextBoolean();
		}
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
		
		
		
		
		
		
	}

}
