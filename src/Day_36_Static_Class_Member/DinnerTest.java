package Day_36_Static_Class_Member;

public class DinnerTest {

	public static void main(String[] args) {


		Dinner mom = new Dinner();	
		Dinner kid = new Dinner();	
		Dinner dad = new Dinner();	
		
		
		System.out.println("Total slices:" + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total slices:" + Dinner.pizzaSlice);

		kid.takeASlice(3);
		dad.takeASlice(2);
		
		System.out.println("Total slices:" + Dinner.pizzaSlice);
		
		
		
		
		
	}

}
