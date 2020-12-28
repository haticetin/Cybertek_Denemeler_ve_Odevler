package Day_36_Static_Class_Member;

public class Countable {

//	int instanceCount;	// instance variable

	static int instanceCount;	// class variable
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
	
	
}
