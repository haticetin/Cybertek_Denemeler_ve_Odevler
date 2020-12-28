package Assignments.Assignment03;

public class Q_5 {

	public static void main(String[] args) {
		
		int inputSeconds=45758;
		int numberOfHours;
		int numberOfMinutes;
		int numberOfSeconds;

		numberOfHours = inputSeconds / 3600 ;
		numberOfMinutes = (inputSeconds % 3600 ) / 60;
		numberOfSeconds = (inputSeconds% 3600 ) % 60  ;
		
		System.out.println("Input Second is: " + inputSeconds);
		System.out.println(numberOfHours + " hours, " + numberOfMinutes + " minutes, " + numberOfSeconds + " seconds");
		
		/*
		int hours=1, minutes=1, seconds=35, inputSeconds;
		
		inputSeconds=hours*3600+minutes*60+seconds;
		
		System.out.println("Input Second is: " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
		*/
		
		
		/*int s=61, hours=s/60, minutes=s%60, seconds=35, inputSeconds;
		inputSeconds=s*(s-minutes)+seconds;
		
		
		System.out.println("Input Second is: " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
		*/
		
		
		
		
		
	}

}
