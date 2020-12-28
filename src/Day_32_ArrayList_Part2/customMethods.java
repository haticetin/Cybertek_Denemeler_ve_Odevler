package Day_32_ArrayList_Part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {


		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.32);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);

		System.out.println("============================");
		double sum = sumList(doubleList);
		
		System.out.println("Sum of all numbers in the list : " + Math.round(sum*100.0)/100.0);
		
		System.out.println("============================");

		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		System.out.println("============================");

		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted);
		
	}

	public static ArrayList<Integer> convertToIntList(ArrayList<String> strnums) {

		ArrayList<Integer> intnums = new ArrayList<>();
		
		for(String value : strnums) {
			intnums.add(Integer.parseInt(value));
		}
		return intnums;
	}

	public static ArrayList<Integer> getRandomList(int size) {

		ArrayList<Integer> numbers = new ArrayList<>();
		
		Random rn = new Random();
		
		for(int i=1; i<=size; i++) {
			numbers.add(rn.nextInt(101));
		}

		return numbers;
	}

	public static ArrayList<Integer> getList(int size) {
		
		ArrayList <Integer> newList = new ArrayList<>(15);
		
		for(int i=1; i<=size; i++) {
			newList.add(i);
		}
		return newList;
	}

	public static double sumList(ArrayList<Double> dlist) {

		double sum = 0;
		for(Double value : dlist) {
			sum+=value;
		}
		return sum;
	}

	public static void printList(ArrayList<Integer> nums) {
		
		for(Integer value : nums) {
			System.out.println(value);
		}
		
//		for(int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}

		
	}

}
