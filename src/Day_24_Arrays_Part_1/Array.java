package Day_24_Arrays_Part_1;

public class Array {

	public static void main(String[] args) {


		int [] myList = {10, 20, 30, 40};
		
//		int [] myList;				// COMPILATION ERROR
//		myList = {1, 2, 3, 4};		// NO new KEYWORD
		
		String[] myFruits = {"Apple", "Orange", "Watermelon"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myList.length);
		System.out.println(myFruits.length);
	
		for(int i=0; i<myFruits.length; i++) {
			System.out.println(myFruits[i]);
		}
	
		// Task
		
		int[] scores = {80,90,100,35,60,72,64,30,10,5,3,99,89,80,90,100,35,60,72,64,30,10,5,3,99,89};
		int sum=0;
		int avgScores=0;
		
		for(int i=1; i<scores.length; i++) {
			sum+=scores[i];
		}
	
		avgScores = sum/scores.length;
		System.out.println("Sum: " + sum);
		System.out.println("Elements: " + scores.length);
		System.out.println("Average of scores: " + avgScores);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
