package Day_05_Unary_Assignment_Relational_Operators;

public class Task_20 {

	public static void main(String[] args) {


		int a = 1;
		int result = -a-- + a++ / -a-- * --a;
		
		System.out.println("a is " + a);
		System.out.println("result is " + result);
		
		// memory: 1   -> 0 -> 1-> 0 -> -1
		// result:       -1 + 0/ -1 * -1 = -1

	}

}
