package Assignments.Assignment12;

import java.util.ArrayList;

public class Q62 {

	public static void main(String[] args) {

		ArrayList<Integer> ints = new ArrayList<>();
		
		System.out.println("Sum: " + sum(ints));
		
	}
	
	public static int sum(ArrayList<Integer> ints) {
		
		ints.add(5);
		ints.add(13);
		ints.add(2);
		ints.add(90);
		ints.add(76);
		ints.add(34);
		
		int total = 0;
		
		for(int value : ints) {
			total += value;
		}
		
		return total;
		
	}

}
