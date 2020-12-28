package Day_10_Control_Flow_Statements_Part4;

public class Task_46 {

	public static void main(String[] args) {


		int number=5;
		int result;
		int repeat=10;
		boolean isInvalidNumber=false;
		
		if(number>0) {
			if(repeat>0) {
				for(int i=1;i<=repeat;i++) {
					
					result=number*i;
					
					System.out.println(number + " x " + i + " = " + result);
				}
			}else {
				System.out.println("Invalid repeat number");
				isInvalidNumber=true;
			}
			
		}else {
			System.out.println("Invalid number");
			isInvalidNumber=true;
		}
		
		if(isInvalidNumber) {
			System.out.println("Try another value");
		}else {
			System.out.println("----------------------------");
			System.out.println("Multiplication Table for " + number);
		}
		
	
		
		
	}

}
