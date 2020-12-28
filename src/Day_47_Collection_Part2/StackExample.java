package Day_47_Collection_Part2;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {


		Vector<Integer> numStack = new Stack<>();
		
		// creating object
		// regular way => Class - Class
		// polymorphic way => Parent/Interface - Class
		// who decides what to access? => reference - Vector
		
		numStack.add(50);
		numStack.add(70);
		numStack.add(500);
		numStack.add(50);

		System.out.println(numStack.toString());
		
		// check value on top of stack
		System.out.println(((Stack<Integer>)numStack).peek());
		
		// read value on top of Stack and remove it
		System.out.println(((Stack<Integer>)numStack).pop());
		
		System.out.println(numStack.toString());
		
		System.out.println(((Stack<Integer>)numStack).peek());

		System.out.println(numStack.get(0));
		
		
		
		
		
		
		
		
		
		
		
	}

}
