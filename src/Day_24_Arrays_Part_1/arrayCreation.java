package Day_24_Arrays_Part_1;

public class arrayCreation {

	public static void main(String[] args) {
		
		int score1=80;
		int score2=38;
		int score3=53;
		int score4=45;
		int score5=69;
//		.........
		int score100=72;
		
		int avgScore = (score1+score2+score3+score4+score5)/5;
		System.out.println(avgScore);
		
		int[] scores = new int[5];
		scores[0]=80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);

		int avgScore2 = (scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
		
		System.out.println(avgScore2);
		
		
		
		
		
		
		// Option-1
		
		int[] numbers1;
		numbers1 = new int[3];
		
		// Option-2
		
		int[] numbers2 = new int[3];
		float[] temp = new float[100];
		char[] letters = new char[40];
		long[] units = new long[50];
		String word[] = new String[5];
		
		System.out.println(numbers1[2]);	// default value = 0
		System.out.println(temp[82]);		// default value = 0.0
		System.out.println(word[4]);		// default value = null
		System.out.println(units[49]);
		System.out.println(letters[34]);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
