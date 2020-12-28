package Assignments.Assignment04;

public class Q11 {

	public static void main(String[] args) {

		double distance, time;
		distance=8734847;
		time=0;
		String medium="Steel";
		
		switch(medium) {
		
		case "Air":
			time=distance/1100;
			break;
		case "Water":
			time=distance/4900;
			break;
		case "Steel":
			time=distance/16400;
			break;
		default:
			System.out.println("Invalid medium");
		}
		
		System.out.println("It takes " + time + "s for sound wave in the " + medium + " to travel");
		
	}

}
