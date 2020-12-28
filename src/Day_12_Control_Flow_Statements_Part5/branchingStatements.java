package Day_12_Control_Flow_Statements_Part5;

public class branchingStatements {

	public static void main(String[] args) {

		int num=0;
		
		while(num<15) {
			
			num++;
			
			if(num<=5) {
			
				System.out.println("Skipping number " + num);
				
				continue;				// compiler will start the loop from the beginning (if)
			}
			
			System.out.println("Number = " + num);
			
			if(num>=10) {
			
				System.out.println("Breaking at " + num);
				
				break;					// compiler will exit the loop
			}
		}
	}

}
