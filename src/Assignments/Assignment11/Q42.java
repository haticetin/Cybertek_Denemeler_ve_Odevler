package Assignments.Assignment11;
import java.util.Arrays;

public class Q42 {

	public static void main(String[] args) {


		String[] arr = {"e", "hey", "bye", "furey", "spoon"};
		
		System.out.println(Arrays.toString(contains_E(arr)));
		
	}

	public static String[] contains_E(String[] arr) {
		
		String target = "e";
		
		String str = "";
		
		for(String value : arr) {
			if(value.contains(target)) {
				str += value + " ";
			}
		}
		
		String[] fewValues = str.split(" ");
		
		return fewValues;
	}
}
