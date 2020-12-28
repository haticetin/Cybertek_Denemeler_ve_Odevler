package Day_15_Method_Overloading;

public class Task_67 {

	public static void main(String[] args) {

		if(lastDigit(239, 738)) {
			System.out.println("They have the same last digit");
		}else {
			System.out.println("They do not have the same last digit");
		}

		lastDigit(237, 87);
	}
	
	public static boolean lastDigit(int num1, int num2) {
		
		if((num1%10)==(num2%10)) {
			return true;
		}else {
			return false;
		}
		
	}

}
