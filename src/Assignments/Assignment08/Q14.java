package Assignments.Assignment08;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three boolean: ");
		
		System.out.println(threeLocks(sc.nextBoolean(), sc.nextBoolean(), sc.nextBoolean()));
		
		
		
		
	}
	
	public static boolean threeLocks(boolean a, boolean b, boolean c){
		
		boolean truthTable;
		
		if(a && b==true || c==true) {
			truthTable=true;
		}else {
			truthTable=false;
		}
		
		return truthTable;
		
	}
	
}


