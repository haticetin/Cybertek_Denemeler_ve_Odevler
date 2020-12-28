package Day_41_Abstraction;

public abstract class Animal {	// object cannot be created when there is abstract
								// abstract class can have both instance and abstract method
								// but instance classes CANNOT have abstract method
								// abstract class cannot be instantiated
	
	public void eat() {		// i need to have eat method but don't know implementation
							// so make the class abstract and don't let any object to be created
		
	}
	
	public abstract void  breath();		// Abstract method
	
	public void move() {	// instance method
		System.out.println("Moving");
	}
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal() {
		
	}
	
	{
		
	}
	
	static {
		
	}
	
	
}
