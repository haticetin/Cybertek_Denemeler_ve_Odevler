package Week12ReviewSession;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsReturnArrayList {

	public static void main(String[] args) {

		System.out.println(getIntList(6));
		System.out.println(getMonths());
		
	}
	
	public static ArrayList<Integer> getIntList(int size) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<=size; i++) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
		
		return numbers;
	}
	
	public static ArrayList<String> getMonths(){
		
		ArrayList<String> months = new ArrayList<>(Arrays.asList("Jan","Feb","Mar","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
		
		return months;

	}
	
	public static ArrayList<Integer> abc(ArrayList<Integer> list){
		
		return list;
	}

}
