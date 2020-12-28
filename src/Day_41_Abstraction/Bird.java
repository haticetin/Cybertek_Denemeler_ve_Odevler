package Day_41_Abstraction;

public abstract class Bird extends Animal{ // first concrete class must implement method

	@Override
	public void breath() {
		System.out.println("Bird is breathing");
	}
	
	public abstract void fly();
	
	public Bird() {
		super("hello");
	}

}
