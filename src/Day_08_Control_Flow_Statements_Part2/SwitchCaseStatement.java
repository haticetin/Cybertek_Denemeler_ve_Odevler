package Day_08_Control_Flow_Statements_Part2;

public class SwitchCaseStatement {

	public static void main(String[] args) {


		String weather= "Sunny";
		
		switch(weather) {
		
		case "Sunny":
			System.out.println("Go to park");
			System.out.println("Code Java");
			break;
		case "Hot":
			System.out.println("Go to swimming");
			System.out.println("Code Java");
			break;
		default:  // Heryerde olabilir ama ortada veya basta olursa ve break olmazsa break olana kadarki herseyi print eder
			System.out.println("Code Java in any other weather");
			break;
		case "Windy":
			System.out.println("Fly a kite");
			System.out.println("Code Java");
			break;
		case "Snow":
			System.out.println("Go snowboarding");
			System.out.println("Code Java");
			break;
		
		
		}
	}

}
