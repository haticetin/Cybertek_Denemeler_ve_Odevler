package Day_16_Class_and_Objects;

public class Contact {
	
	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println(phoneNumber + " calling...");
	}
	
	public void sendMessage() {
		System.out.println(name + " sent you a new message");
	}
	
	public void sendEmail() {
		System.out.println("You got a new mail from " + email);
	}

}
