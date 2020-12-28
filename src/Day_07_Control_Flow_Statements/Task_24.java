package Day_07_Control_Flow_Statements;

public class Task_24 {

	public static void main(String[] args) {


		int age= 18;
		
		/* if (age >18 || age == 18) {  							boyle de yazilabilir
			System.out.println("You are eligible to vote");
		}
		*/
		if (age >18 || age == 18) {
			System.out.println("You are eligible to vote");
		}
		
		else if (age < 18) {
			System.out.println("You are not eligible to vote");
		}
		

	}

}
