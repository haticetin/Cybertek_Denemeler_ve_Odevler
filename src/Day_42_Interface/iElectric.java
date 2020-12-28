package Day_42_Interface;

public interface iElectric {	// developerlar interface isminin onune i koyuyolar - interface oldugunu belirtmek icin

	public static final boolean has_batteries = true;
	
	boolean has_batteries2 = false; // public final static
	
	public abstract void charge();
	
	void charge2();	// even if you dont write - this is- public abstract
	
	public default void methodA() {
		// code
	}
	
	public static void methodB() {
		// code
	}
	
	public final int num = 5;
	
		
	
}
