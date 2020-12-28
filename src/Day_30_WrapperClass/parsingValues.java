package Day_30_WrapperClass;

public class parsingValues {

	public static void main(String[] args) {

		
		// Converting String to wrapper class
		
		Double db1 = Double.valueOf("34.7");
		Integer it = Integer.valueOf("542");
		Boolean bool = Boolean.valueOf("FALSE");

		// Converting String to primitive
		
		db1 = Double.parseDouble("34.7");
		it = Integer.parseInt("542");
		bool = Boolean.parseBoolean("true");
				
		String numberAsString = "2018";
		System.out.println(numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println(number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println(numberAsString);	// concat
		System.out.println(number);	// arithmetic calculation
		
		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		int i = 10;
		String s = String.valueOf(i);	// converts from int to String
										// it will return "10"
		System.out.println(s);				
		String s2 = Integer.toString(i);	// converts from int to String
											// it will return "10"
		System.out.println(s2);

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
