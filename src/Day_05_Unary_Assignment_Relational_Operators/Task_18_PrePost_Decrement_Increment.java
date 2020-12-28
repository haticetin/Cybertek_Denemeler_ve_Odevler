package Day_05_Unary_Assignment_Relational_Operators;

public class Task_18_PrePost_Decrement_Increment {

	public static void main(String[] args) {


		int x = 2;
		int y = x++; // burda x'i increment yaptik ama post oldugu icin x bu line'da artmicak, o yuzden y de 2 olucak 
		             // bu line ve altina x'i print ettigimizde compiler onu artmis olarak print edecek  
		y=x;
		
		System.out.println(x);
		System.out.println(y);

	}

}
