package Assignments.Assignment09;

public class Q8 {

	public static void main(String[] args) {


		String name = "alejandro";
		String email = "subject: important project, Alejandro we refer to you this ....";
		
		email = email.toLowerCase();
		int firstIndex = email.indexOf(name);
		int lastIndex = email.indexOf(name) + 9;		
		
		if(email.indexOf(name)!=-1) {
			if(email.substring(firstIndex, lastIndex).equals(name)) {
				System.out.println("Read this email");
			}
		}else {
			System.out.println("Don't read this email");
		}
		
	}

}
