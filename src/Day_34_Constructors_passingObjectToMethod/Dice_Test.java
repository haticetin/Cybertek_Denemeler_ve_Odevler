package Day_34_Constructors_passingObjectToMethod;

public class Dice_Test {

	public static void main(String[] args) {


		final int sixSides = 6;
		final int twentySides = 20;
		
		Dice d = new Dice(sixSides);
		Dice e = new Dice(twentySides);
		
		rollDice(d);
		rollDice(e);
	}
	
	public static void rollDice(Dice d) {
		
		System.out.println("Rolling a " + d.getSides() + " sided dice");
		
		d.roll(); // no need because in the constructor roll method is already called
				  // called roll method twice 1- constructor 2- here
		
		System.out.println("The dice value: " + d.getValue());
		
	}

}
