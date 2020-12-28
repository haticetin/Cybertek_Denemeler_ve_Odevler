package Day_05_Unary_Assignment_Relational_Operators;

public class unaryOperators {

	public static void main(String[] args) {


		int i1= +10;
		int i2= -100;
		int i3= -(i1+i2);
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		boolean flag = true;
		System.out.println(!flag);
		System.out.println(!!!!!!flag);
		
		int i=10, j=5;
		i++; // same as i = i+1 
		--j; // same as j = j-1
		
		// POST: its not becoming active on same line. First value is being same and then being increased in memory
		// PRE: its becoming active on same line. First value is being increased in memory and then being assigned.
		
		
		System.out.println(i++); // since its post it printed on the same line the answer is normal value. RAM increased but here no.
		System.out.println(i); //now its on second line so it prints the value which was increased on RAM.
		
		System.out.println(--j); // since its pre it printed new value.
		System.out.println(j);
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		
		// i=11 , j=4
		int res = i++ + --j;
		
		System.out.println("res = " + res);
		
		//res = 11 + 3
		//i   = 11
		//j   = 3

	}

}
