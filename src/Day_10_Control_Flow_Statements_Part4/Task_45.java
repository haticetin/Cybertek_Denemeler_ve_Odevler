package Day_10_Control_Flow_Statements_Part4;

public class Task_45 {

	public static void main(String[] args) {

		
		int num1=39;
		int num2=48;
		int repeat=3;
		
		for(int i=0;i<repeat;i++) {
			if(num1>num2) {
				System.out.println("Number 1 (" + num1 + ") is greater than number 2 (" + num2 + ")");
			}else if(num2>num1){
				System.out.println("Number 2 (" + num2 + ") is greater than number 1 (" + num1 + ")");
			}else {
				System.out.println("Number 1 (" + num1 + ") and number 2 (" + num2 + ") are equal");
			}
		}
		
		
	}

}
