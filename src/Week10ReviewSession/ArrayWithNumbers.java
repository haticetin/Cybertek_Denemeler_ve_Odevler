package Week10ReviewSession;

public class ArrayWithNumbers {

	public static void main(String[] args) {


		// declare numsArray with 5 numbers and assign values to each index
		
		int[] numsArray = new int[5];
		numsArray[0] = 123;
		numsArray[1] = 345;
		numsArray[2] = 33;
		numsArray[3] = 10;
		numsArray[4] = numsArray[0]+numsArray[1];


		// declare and assgin values in same statement
		
		int[] numsArray2 = {44,12,44,66,55,88};
		
		// declare and assign values in same statements using new keyword
		
		int[] numsArray3 = new int[] {33,55,6,1,42,54,900,324};
		
		// print array items in reverse in same line
		
		for(int i=numsArray2.length-1; i>0; i--) {
			System.out.print(numsArray2[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
