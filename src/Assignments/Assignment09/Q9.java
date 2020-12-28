package Assignments.Assignment09;

public class Q9 {

	public static void main(String[] args) {


		String email = "mike_tyson@gmail.com";
				
		if(email.contains("_")) {
			
			String surname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
			String name = email.substring(0, email.indexOf("_"));
			String underScore = email.substring(name.length(), email.indexOf(surname));
			String emailRest = email.substring(email.indexOf("@"));
			
			email = surname + underScore + name +  emailRest;
			System.out.println(email);
			
		}else {
			System.out.println(email);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
