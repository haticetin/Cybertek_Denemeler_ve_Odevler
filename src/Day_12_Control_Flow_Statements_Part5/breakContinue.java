package Day_12_Control_Flow_Statements_Part5;

public class breakContinue {

	public static void main(String[] args) {


		for(int i=1; i<=5; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		
		for(int j=1; j<=5; j++) {
			if(j==4) {
				continue;
			}
			System.out.println(j);
		}
	}

}
