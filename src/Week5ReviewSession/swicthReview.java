package Week5ReviewSession;

public class swicthReview {

	public static void main(String[] args) {

		char grade='A';
		
		switch (grade) {
		case 'A': case 'B':
			System.out.println("Pass");
		default:
			System.out.println("Fail");
		}
		
		
		int surveyresult=2;
		
		switch(surveyresult) {
		
		case 1:
			System.out.println("Very bad");
			break;
		case 2: case 3:
			System.out.println("Bad");
			break;
		case 4:
			System.out.println("OK");
			break;
		case 5:
			System.out.println("Good");
			break;
		default:
			System.out.println("Invalid Selection");
		}
			
	
	}

}
