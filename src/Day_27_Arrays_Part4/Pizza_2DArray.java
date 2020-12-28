package Day_27_Arrays_Part4;

import java.util.Arrays;

public class Pizza_2DArray {

	public static void main(String[] args) {


		String[][] pizzas = {
				{"pineapple","pepperoni"},
				{"anchovies","mushrooms","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zucchini","brocoli","spinach","shrimp"}
		};
		
		System.out.println("#### FOR ITERATOR LOOP ####");
		for(int i=0; i<pizzas.length; i++){
				System.out.println(Arrays.toString(pizzas[i]));
		}
		
		System.out.println("#### FOR EACH LOOP ####");
		
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println();
		
		for(String value : pizzas[3]) {
			System.out.println(value);
		}
		
		System.out.println();
		
		int[][] students = {{4,5,6},{12,5,7},{23,56,12,55,3}};
		
		for(int[] group : students) {
			for(int studentID : group) {
				System.out.print(studentID + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
