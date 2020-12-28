package Day_27_Arrays_Part4;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {


		int [] num1 = new int[]{4,5,2,10};
		int [] num2 = {4,5,2,10};
		int [] num3 = {10,4,5,2};
		int [] num4 = {4,5,2,10,90};
		int [] num5 = {54,23,54,123,54};
		
		
		
		System.out.println(Arrays.equals(num1, num2));
		System.out.println(num1==num2);
		
		System.out.println(Arrays.equals(num2, num3));
		
		System.out.println("================");
		
		Arrays.sort(num2);
		Arrays.sort(num3);
		
		System.out.println(Arrays.equals(num2, num3));

		String[] cars1 = {"Toyota","Honda","Tesla","BMW","Dodge"};
		String[] cars2 = {"Toyota","Honda","Tesla","BMW","Dodge"};
		String[] cars3 = {"toyota","honda","tesla","bmw","dodge"};
		String[] cars4 = {"Toyota","Honda","Tesla"};
		
		System.out.println(Arrays.toString(cars1));
		System.out.println(Arrays.toString(cars1).toUpperCase());	// not assigned to a variable so in the air done :))
		System.out.println(Arrays.toString(cars1));
		

		System.out.println("----------------");
		
		String[] newCars = Arrays.copyOf(cars1, 3);
		System.out.println(Arrays.toString(newCars));
		
		System.out.println("===========");
		
		int[] nums = {44,12,5,900,1,-5};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(nums));
		
		String[] companies = {"Cybertek", "Capital One", "FreddiMac", "apple", "Google", "Verizon"};
		
		Arrays.sort(companies);
		
		System.out.println(Arrays.toString(companies));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
