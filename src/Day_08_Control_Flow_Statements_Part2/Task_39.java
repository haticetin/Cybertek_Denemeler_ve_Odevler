package Day_08_Control_Flow_Statements_Part2;

public class Task_39 {

	public static void main(String[] args) {


		String trafficLight="G/g";
		
		switch (trafficLight) {
		
			case "R/r":
				System.out.println("Red");
				System.out.println("Stop");
				break;
			case "R/y":
				System.out.println("Yellow");
				System.out.println("Ready");
				break;
			case "G/g":
				System.out.println("Green");
				System.out.println("Go");
				break;
			case "G/y":
				System.out.println("Yellow");
				System.out.println("Slow down");
				break;
			default:{
				System.out.println("Not a valid traffic light");
		}
		}
	}

}
