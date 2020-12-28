package Assignments.Assignment09;

public class Q11 {

	public static void main(String[] args) {


		String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		
		String sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
		String phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
		String messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
		
		System.out.println("Sender: " + sender);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Message Body: " + messageBody);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
