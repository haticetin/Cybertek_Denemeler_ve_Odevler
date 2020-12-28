package Day_09_Control_Flow_Statements_Part3;

public class orLogicWithSwitch {

	public static void main(String[] args) {

		char grade='D';
		
//		switch(grade) {
//		case 'A':
//			System.out.println("pass");
//			break;
//		case 'B':
//			System.out.println("pass");
//			break;
//		case 'C':
//			System.out.println("pass");
//			break;
//		case 'D':
//			System.out.println("fail");
//			break;
//		case 'E':
//			System.out.println("fail");
//			break;
//			
//		}
		
		
		switch (grade) {
		
			case 'A': case 'B': 		// boyle yan yana da yazilabiliyor
			case 'C':
				System.out.println("Pass");
				break;
			case 'D':
			case 'E':
				System.out.println("Fail!");
				break;
		}
		
		
		
		
		
		
		
			

	}

}
