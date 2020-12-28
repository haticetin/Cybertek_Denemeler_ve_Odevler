package Day_13_Methods_Part1;

public class Task_62 {

	public static void main(String[] args) {

		greatestNumber(4932, 4932, 4783);
		
	}

	public static void greatestNumber(int num1, int num2, int num3) {
		
		if(num1>=num2 && num1>=num3) {
			if(num1==num2) {
				System.out.println("Number 1(" + num1 + ") and number 2 (" + num2 + ") are equal");
			}else if(num1==num3) {
				System.out.println("Number 1(" + num1 + ") and number 3 (" + num3 + ") are equal");
			}else {
				System.out.println("The greatest number is number 1 (" + num1 + ")");
			}
		}else if(num2>num3) {
			if(num2==num3) {
				System.out.println("Number 2(" + num2 + ") and number 3 (" + num3 + ") are equal");
			}else {
				System.out.println("The greatest number is number 2 (" + num2 + ")");
			}
		}else if(num3>num2){
			System.out.println("The greatest number is number 3 (" + num3 + ")");
		}else {
			System.out.println("All numbers are equal");
		}
	}
}
