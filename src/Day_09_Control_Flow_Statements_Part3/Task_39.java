package Day_09_Control_Flow_Statements_Part3;

public class Task_39 {

	public static void main(String[] args) {

		char trafficLight='g';
		
		switch(trafficLight) {
		
		case 'R': case 'r':
			System.out.println("Red");
			System.out.println("Stop");
			break;
		case 'Y': case 'y':
			System.out.println("Yellow");
			System.out.println("Ready");
			break;
		case 'G': case 'g':
			System.out.println("Green");
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid color");
		}
		
	}

}
