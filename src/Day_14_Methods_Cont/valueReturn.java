package Day_14_Methods_Cont;

public class valueReturn {

	public static void main(String[] args) {


		sum(2, 3);			// <- when you return a local variable in a method the variable will be hold in method calling part
		
		// System.out.println(result);		// result hala local variable o yuzden error veriyor
		
		// WAYS OF PRINTING RETURNED VARIABLE:
		// Way I:
		
		System.out.println(sum(2, 3));
		
		// Way II:
		
		int number=sum(2, 3);
		
		System.out.println(number*5);
		
		
	}
	
	public static int sum(int num1, int num2) {
		
		int result;
		result=num1+num2;
		
		return result;
	}

}
