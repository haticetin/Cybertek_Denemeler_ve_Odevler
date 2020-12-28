package Day_30_WrapperClass;

public class varArgs {		// variable arguments

	public static void main(String[] args) {

		
//		int... numbers = 2,5,6,8,2,4,1; --> not valid ONLY available as a parameter
		sum(2, 4);
		sum(2, 3, 5, 6);
		sum(5, 10, 50);
//		sum(null);	// no compile time error but NUllPointerException
		concat("Apple", "Orange", "123", "Result");
//		concat(null);	// no compile time error but NUllPointerException
		int nums[] = {2,3,77};
		printAllNumbersAsArray(nums);
		printAllNumbers(1,2,3,4,54,23432,423,23432);
		printAllNumbers(3,4,6,7);
		
		
	}						//	   -> -> -> is making the argument an array
//								  |
	public static void sum(int... numbers) { // a varArg parameter can take a variable number of arguments
		
		
		int sum=0;
		
		for(int value : numbers) {
			sum+=value;
		}
		
		System.out.println(sum);
	}

	public static void concat(String... strs) {
		
		String newStr = "";
		
		for(String str : strs) {
			
			newStr+=str.charAt(2);
			
		}
		
		System.out.println(newStr);
		
	}
	
//	public static void sum(int[] numbers) { --> varArg oldugu icin arrayi kabul etmiyor cunku ayirt edemiyor
//		
//		
//		int sum=0;
//		
//		for(int value : numbers) {
//			sum-=value;
//		}
//		
//		System.out.println(sum);
//	}
	
	public static void printAllNumbersAsArray(int[] numbers) {
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
//									-> -> -> -> will act like an array so in [] index can be given	
//									|
	public static void printAllNumbers(int... numbers) {
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = numbers[numbers.length-(i+1)];
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
	
	
}
