package Assignments.Assignment09;

import java.util.Scanner;

public class Q13 {
	
	static Scanner sc = new Scanner(System.in);
	static Q13_Class route = new Q13_Class();

	public static void main(String[] args) {
		
		System.out.println("Start Point: ");
		
		String startPoint = sc.next();
		
		System.out.println("End Point: ");
		
		String endPoint = sc.next();

		System.out.println(route(startPoint, endPoint));
		
	}
	
	public static String route(String startPoint, String endPoint) {
		
		String message = "";		
				
		if(startPoint.equalsIgnoreCase(endPoint)) {
			message = endPoint.toUpperCase() + " found";
		}else {
			switch(startPoint) {
			case "A": case "a":
				message = route.caseA(startPoint, endPoint);
				break;
			case "B": case "b":
				message = route.caseB(startPoint, endPoint);
				break;
			case "C": case "c":
				message = route.caseC(startPoint, endPoint);
				break;
			case "D": case "d":
				message = route.caseD(startPoint, endPoint);
				break;
			}
		}
				
		return message;
		
	}
	
}
