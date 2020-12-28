package Day_41_Abstraction;

public class Parrot extends Bird{ // second concrete class doesnt have to implement

	@Override
	public void breath() {
		System.out.println("Parrot is breathing");
	}
	
	public void fly() {
		System.out.println("Parrot is breathing");
	}
}
