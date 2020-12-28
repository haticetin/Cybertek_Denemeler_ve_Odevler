package Day_36_Static_Class_Member;

public class StaticInit {

	static final int NUM_SECONDS_PER_HOURS;
	
	static {
		System.out.println("Static init");
		int numSecondPerMin=60;
		int numMinPerHour=60;
		NUM_SECONDS_PER_HOURS=numSecondPerMin*numMinPerHour;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;

	static {
		one = 1;
		two = 2;
//		three = 4;
//		two = 4;
	}
	
}
