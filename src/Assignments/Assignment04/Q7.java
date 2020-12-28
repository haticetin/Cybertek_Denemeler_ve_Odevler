package Assignments.Assignment04;

public class Q7 {

	public static void main(String[] args) {


		int seconds, minutes, hours, days;
		seconds=34395;
			
		if (seconds==60) {
			minutes=seconds/60;
			System.out.println("There is " + minutes + " minute in " + seconds + " seconds.");
		}else if(seconds>=60 && seconds<3600) {
			minutes=seconds/60;
			System.out.println("There are " + minutes + " minutes in " + seconds + " seconds.");
		}else if(seconds==3600) {
			hours=seconds/3600;
			System.out.println("There is " + hours + " hour in " + seconds + " seconds.");
		}else if(seconds>=3600 && seconds<86400) {
			hours=seconds/3600;
			System.out.println("There are " + hours + " hours in " + seconds + " seconds.");
		}else if(seconds==86400) {
			days=seconds/86400;
			System.out.println("There is " + days + " day in " + seconds + " seconds.");
		}else {
			days=seconds/86400;
			System.out.println("There are " + days + " days in " + seconds + " seconds.");
		}
		
	}

}
