package Day_13_Methods_Part1;

public class passMultipleArguments {

	public static void main(String[] args) {


		showSum(5, 10);
		showSum(20, 60);
		showSum(390, 232);
		showSum(39201, 220);
		showSum(20, 29);
		rightName("Betul", true);
		rightName("Kubra", false);
		
		
	}
	
	public static void showSum(int num1, int num2) {
		
		System.out.println(num1+num2);
		
		
	}
	
	public static void rightName(String name,boolean right) {
		
		System.out.println(name + " = " + right);
	}

}



























