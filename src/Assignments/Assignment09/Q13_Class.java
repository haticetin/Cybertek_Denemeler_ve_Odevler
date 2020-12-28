package Assignments.Assignment09;

public class Q13_Class {

	String message = "";	

	public String caseA(String startPoint, String endPoint) {
				
		String found = endPoint.toUpperCase()  + " found";

		switch(startPoint) {
		case "A": case "a":
			switch(endPoint) {
			case "B": case "b":
				message = "right : " + found;
				break;
			case "C": case "c":
				message = "right > down : " + found;
				break;
			case "D": case "d":
				message = "right > down > left : " + found;
				break;
			}
		}
		
		return message;
		
	}
	
	public String caseB(String startPoint, String endPoint) {
		
		String found = endPoint.toUpperCase()  + " found";

		switch(startPoint) {
		case "B": case "b":
			switch(endPoint) {
			case "C": case "c":
				message = "down : " + found;
				break;
			case "D": case "d":
				message = "down > left : " + found;
				break;
			case "A": case "a":
				message = "down > left > up : " + found;
				break;
			}
		}
		
		return message;
		
	}
	
	public String caseC(String startPoint, String endPoint) {
		
		String found = endPoint.toUpperCase()  + " found";
		
		switch(startPoint) {
		case "C": case "c":
			switch(endPoint) {
			case "D": case "d":
				message = "left : " + found;
				break;
			case "A": case "a":
				message = "left > up : " + found;
				break;
			case "B": case "b":
				message = "left > up > right : " + found;
				break;
			}
		}
		
		return message;
		
	}
	
	public String caseD(String startPoint, String endPoint) {
		
		String found = endPoint.toUpperCase()  + " found";
		
		switch(startPoint) {
		case "D": case "d":
			switch(endPoint) {
			case "A": case "a":
				message = "up : " + found;
				break;
			case "B": case "b":
				message = "up > right : " + found;
				break;
			case "C": case "c":
				message = "up > right > down : " + found;
				break;
			}
		}
		
		return message;
		
	}

}
