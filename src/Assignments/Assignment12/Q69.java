package Assignments.Assignment12;

import java.util.ArrayList;

public class Q69 {

	public static void main(String[] args) {

		ArrayList<Boolean> bool = new ArrayList<>();
		
		repeatAL(bool);
		
	}
	
	public static void repeatAL(ArrayList<Boolean> bool) {
		
		bool.add(true);
		bool.add(false);
		bool.add(false);
		
		int size = bool.size();
		
		for(int i=0; i<size; i++) {
			bool.add(bool.get(i));
		}
		
		System.out.println(bool);
		
	}

}
