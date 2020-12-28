package Assignments.Assignment09;

public class Q10 {
	
	public static void main(String[] args) {
		
		String email = "craig_federighi@apple.com";
		
		String name = email.substring(0, email.indexOf("_"));
		String surname = email.substring(email.indexOf("_")+1, email.indexOf("@"));
		String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
		String topLevelDomain = email.substring(email.indexOf("com"));
		
		name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
		surname = surname.substring(0, 1).toUpperCase() + surname.substring(1, surname.length());

		System.out.println("First name: " + name);
		System.out.println("Last name: " + surname);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topLevelDomain);
		
		
		
	}

}
