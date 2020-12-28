package Assignments.Assignment11;

public class Q39 {

	public static void main(String[] args) {


		String email = "my@fancy@email.com";
		
		Email(email);
		
	}
	
	public static void Email(String email) {
		
		String target = "@";
		int counter = 0;
		
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				counter++;
			}
		}	
			
		if(counter==1) {
				
			String[] arr = email.split(target);
				
			System.out.println("Email id: " + arr[0]);
			System.out.println("Email domain: " + arr[1]);
		}else {
			System.out.println("Invalid email");
		}
	}

}
