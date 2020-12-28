package Day_34_Constructors_passingObjectToMethod;

public class Light {

	int numOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0, false);	// invoking constructor accepting 2 parameters int and boolean
		System.out.println("Returning from no-argument constructor NO.1");
	}
	
	public Light(int watt, boolean ind) {
		this(watt, ind, "X");
		System.out.println("Returning from constructor NO.2");
	}

	public Light(int numOfWatts, boolean indicator, String location) {
		this.numOfWatts = numOfWatts;
		this.indicator = indicator;
		this.location = location;
	}
	
	
	
	
	
}
