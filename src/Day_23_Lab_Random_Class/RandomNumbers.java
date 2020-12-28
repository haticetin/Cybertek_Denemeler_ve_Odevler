package Day_23_Lab_Random_Class;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {


		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());	// 0.0 - 1.0
		
		System.out.println(rn.nextFloat());		// 0.0 - 1.0
		
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(100));	// 0-99, 100 not included 
		
		System.out.println(rn.nextInt(10));		// 0-9
		
		System.out.println(rn.nextInt(10)+5);	// 0-9 => 5-14
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
