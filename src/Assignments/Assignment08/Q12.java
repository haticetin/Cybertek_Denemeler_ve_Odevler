package Assignments.Assignment08;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 boolean: ");
		
		System.out.println(hamletQuote(sc.nextBoolean(), sc.nextBoolean()));
		
	}
	
	public static boolean hamletQuote(boolean first, boolean second) {
		
		boolean toBeOrNotToBe;
		
		if(first==true||second==true) {
			toBeOrNotToBe=true;
		}else {
			toBeOrNotToBe=false;
		}
		
		return toBeOrNotToBe;
	}

}
