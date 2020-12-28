package Day_30_WrapperClass;

public class boxing {

	public static void main(String[] args) {


		// Auto-boxing => primitive type to Wrapper Reference type
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		// Unboxing => object to primitive
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		long l1 = new Long(60000L);	// unboxing because Long(object) is 
									// assigned to long(primitive)
		
		Long l2 = new Long(3479144); // no unboxing
		long l3 = l2;
		
		Integer i1 = 34;
		Integer i2 = i1;
		System.out.println(i1);
		System.out.println(i2);
		
		
		int x = 345;
		double y = x;
		
		Integer num3 = Integer.valueOf(345);
		Double d3 = (double)num3;	// casting not possible with wrapper classes
									// it must be casted explicitly
		System.out.println(d3);
		System.out.println(num3);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
