package Day_22_String_Manipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {


		String userName = " "; // space is a character so it's not empty
		String password = "";
		
		// isEmpty() method returns true if only length is 0.
		
		if(userName.isEmpty()) {
			System.out.println("Username field cannot be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		
		if(userName.isEmpty()||password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
		
		// isBlank() method returns true when length is 0 or there is white space
		
		if(userName.isBlank()) {
			System.out.println("Username cannot be blank");
		}else {
			System.out.println("Username is not blank");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
