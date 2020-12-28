package Day_08_Control_Flow_Statements_Part2;

public class Task_37 {

	public static void main(String[] args) {


		String brand="apple";
		
		switch (brand){
		
			case "apple":
				System.out.println("No virus");
				break;
			case "dell":
				System.out.println("Tough one");
				break;
			case "lenovo":
				System.out.println("Good but not perfect");
				break;
			case "acer":
				System.out.println("Not recommended");
				break;
			default: {
				System.out.println("Do not buy that one!");
		}
		
		
		}
	}

}
