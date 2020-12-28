package Day_20_String_Manipulation_Part2;

import java.util.Scanner;

public class Task_82 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your username: ");
		String username=sc.nextLine();
		System.out.print("Enter your password: ");
		String password=sc.nextLine();
		
		String message = login(username, password);
		
		System.out.println(message);
		
	}
	
	public static String login(String username, String password) {
		
		String userName="haticetin";
		String Password="23B23a2y";
		String message;
		
		if(username.equals(password) && password.equals("")) {
			message = "UserName and Password Fields cannot be empty!";
		}else if(username.equals("") && !password.equals("")) {
			message = "Username cannot be empty!";
		}else if(!username.equals("") && password.equals("")) {
			message = "Password cannot be empty";
		}else if(!username.equals(userName) || !password.equals(Password)) {
			message = "Username or password is not valid. Please verify!";
		}else {
			message = "User logged in successfully :)";
		}
		
		return message;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
