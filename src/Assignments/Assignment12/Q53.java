package Assignments.Assignment12;

import java.util.*;

public class Q53 {

	public static void main(String[] args) {

		System.out.println(totalScore());
		
	}
	
	public static String totalScore() {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int[] scores = new int[7];
		double difficulty;
		double total = 0;
		int max = 0;
		int min = 0;
		
		for(int i=1; i<=7; i++) {
			System.out.println("Enter score for judge " + i + ":");
			scores[i-1]=sc.nextInt();
			max = scores[0];
			min = scores[0];
			if(scores[i-1]>max) {
				max=scores[i-1];
			}else if(scores[i-1]<min){
				min=scores[i-1];
			}
		}
		
//		difficulty = min + (rn.nextDouble()%((max-min)+1)
		difficulty = Math.round((1.2 + (rn.nextDouble()%((3.8-1.2)+1)))*10.0)/10.0;
		System.out.println("Enter difficulty:" + difficulty);
		
		for(int value : scores) {
			if(value!=max && value!=min) {
				total += value;
			}
		}
		
		total *= difficulty;
		total *= 0.6;
		
		return String.format("Total: %.2f", total);
		
	}

}
