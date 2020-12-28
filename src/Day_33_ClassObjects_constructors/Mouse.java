package Day_33_ClassObjects_constructors;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	
	// 1
	public Mouse(int weight) {
		this(weight, 20);		// -> Constructor chaining
								// means calling constructor with no argument
								// always has to be first
								// only one constructor can be called because called constructor should be
								// 1st line but if there are 2 const. called one will be called in second line
		this.weight = weight;
		System.out.println("Java");
	}
	
	// 2
	public Mouse(int weight, int numTeeth) {
		this(50, 20, weight);	// constructor 3'u cagirdik
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}

	// 3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	
	
}
