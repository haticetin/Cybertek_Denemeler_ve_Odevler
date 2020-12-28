package Day_44_OOPpractice.CallCenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true; 	// public static final
	
	void call(String contact);	// public abstract
	
	// static method
	// when implemented its being hidden
	public static void decline() {
		System.out.println("Mike declined voice call...");
	}	
	
	// default method
	// doesnt have to be overriden
	public default void accept() {
		System.out.println("Mike finally accepted voice call...");
	}

}
