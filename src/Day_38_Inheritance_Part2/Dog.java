package Day_38_Inheritance_Part2;

public class Dog extends Animal{

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	
	// if there is constructor in super class you must call it
	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth,
			String coat) {
		super(name, brain, body, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew() is chewing");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	
	
	
	
}
