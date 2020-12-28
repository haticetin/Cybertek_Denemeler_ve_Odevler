package Day_16_Class_and_Objects;

public class ContactObject {

	public static void main(String[] args) {


		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		Contact contact3 = new Contact();
		
		contact1.name="Betul";
		contact1.phoneNumber="+491786866442";
		contact1.email="cetin.betul@yahoo.com";
		
		contact1.call();
		System.out.println("It's " + contact1.name);
		contact1.sendEmail();
		contact1.sendMessage();	
		
		
		contact2.email="haticetin999@gmail.com";
		contact2.name="Kubra";
		contact2.phoneNumber="+491631765808";
		
		contact2.sendMessage();
		
	}

}
