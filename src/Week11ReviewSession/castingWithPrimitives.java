package Week11ReviewSession;

public class castingWithPrimitives {

	public static void main(String[] args) {


		int intValue = 123;
		double doubleValue = intValue;	// implicit(automatic) casting
		
		Integer wrapperInt = Integer.valueOf(100);
		Double wrapperDouble = (double) wrapperInt;	// unboxing -> casting -> Autoboxing
		/*
		int x = wrapperInt;
		Double wrapperDouble = (double) x;	// primitive x is assigned to wrapper class Double
		*/
		
//		Double wrapperDouble = wrapperInt;	// ERROR: can not cast among wrappers
		
		
	}

}
