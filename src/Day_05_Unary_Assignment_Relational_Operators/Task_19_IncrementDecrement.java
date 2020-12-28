package Day_05_Unary_Assignment_Relational_Operators;

public class Task_19_IncrementDecrement {

	public static void main(String[] args) {


		int a= 50;
		int result= --a + a++ + a-- + a++ + a--;
		System.out.println("a = " + a);
		System.out.println("result = " + result);
		
		
		// a in memory: 50 -> 49 -> 50 -> 49 -> 50 -> 49
		// result     : 49 + 49 + 50 + 49 + 50 = 247
		
	}

}
