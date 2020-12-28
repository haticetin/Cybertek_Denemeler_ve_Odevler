package Day_14_Methods_Cont;

public class Task_66 {

	public static void main(String[] args) {

		int distance=distance(50, 3);
		System.out.println(distance);
		
		System.out.println("distance: " + 50*3);
	}
	
	public static int distance(int speed, int time) {
		
		int distance;
		distance=speed*time;
		
		return distance;					// breaking point
		
		// System.out.println(speed);		// anything coded after return will be error	
	}

}
