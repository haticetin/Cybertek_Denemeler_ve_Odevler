package Day_08_Control_Flow_Statements_Part2;

public class Task_33 {

	public static void main(String[] args) {


		double mark=60;
		
		if(mark<60 && mark>=0) {
			System.out.println("Fail!");
		}else if(mark>=60 && mark<90) {
			System.out.println("Pass");
		}else if(mark>=90 && mark<=100) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Not valid");
		}
	}

}
