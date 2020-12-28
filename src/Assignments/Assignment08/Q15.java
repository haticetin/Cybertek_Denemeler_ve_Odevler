package Assignments.Assignment08;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a boolean and 2 numbers: ");
		
		System.out.println(validateTask(sc.nextBoolean(), sc.nextInt(), sc.nextInt()));
		
	}
	
	public static boolean validateTask(boolean isNotEmpty, int currentTaskID, int nextTaskID) {
		
		boolean returns;
		
		if(isNotEmpty==true) {
			if(nextTaskID==currentTaskID+1) {
				returns=true;
			}else {
				returns=false;
			}
		}else {
			returns=false;
		}
		
		return returns;
		
	}

}
