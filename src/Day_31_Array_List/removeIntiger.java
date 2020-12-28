package Day_31_Array_List;

import java.util.ArrayList;

public class removeIntiger {

	public static void main(String[] args) {


		ArrayList<Integer> nums = new ArrayList<>(34); // capacity is 34
		
		System.out.println(nums.size()); 	// but empty so size is 0
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		
		nums.remove(5);
		
		System.out.println(nums.toString());
		
		nums.remove(new Integer(4));	// boyle yazdigimizda hep new 
										// kullanmak zorunda miyiz?
										// object primitive girebiliyor -> unboxing
		
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);
		
		System.out.println(nums.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
