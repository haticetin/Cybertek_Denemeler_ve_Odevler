package Day_07_Control_Flow_Statements;

public class Task_27 {

	public static void main(String[] args) {


		int hour = 13;
		
		if (hour < 12) {
			System.out.println("Good Morning");
		}
		
		if (hour >= 12 && hour < 15) {
			System.out.println("Good Afternoon");
		}
		
		if (hour >= 15) {
			System.out.println("Good Evening");
		}
		
	}

}
