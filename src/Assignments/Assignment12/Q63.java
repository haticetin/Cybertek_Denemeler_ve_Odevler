package Assignments.Assignment12;

import java.util.ArrayList;

public class Q63 {

	public static void main(String[] args) {


		ArrayList<Double> doubles = new ArrayList<>();
		
		System.out.println(removed(doubles));
		
	}
	
	public static ArrayList<Double> removed(ArrayList<Double> doubles){
		
		doubles.add(2.5);
		doubles.add(6.2);
		doubles.add(1.9);
		doubles.add(8.6);
		doubles.add(4.5);
		doubles.add(7.3);
		
		doubles.remove(0);
		doubles.remove(6.2);
		
		return doubles;
		
	}

}
