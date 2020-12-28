package Day_27_Arrays_Part4;

public class Task_95 {

	public static void main(String[] args) {


		int[][] scores = {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		
		int Student1=0;
		
		for(int score : scores[0]) {
			Student1+=score;
		}
		
		int average = Student1/scores[0].length;
		
		System.out.println("Average of Student-1 : " + average);
		
		int mathScores=0;
		
		for(int i=0; i<scores.length; i++) {
			mathScores+=scores[i][0];
		}
		
		System.out.println("Total math score: " + mathScores);
	}

}
