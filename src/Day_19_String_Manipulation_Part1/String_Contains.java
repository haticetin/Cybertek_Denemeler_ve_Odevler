package Day_19_String_Manipulation_Part1;

public class String_Contains {

	public static void main(String[] args) {


		String email = "test@gmail.com";
		
		System.out.println(email.contains("@"));
		
		String list = "potatoes, tomatoes, eggs, milk, bread, cereal, meat, apples";
		if(list.contains("apples")) {
			System.out.println("Apples are in your list");
		}else {
			System.out.println("Apples are not in your list");
		}
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: " + hasEggs);
		
		boolean hasCucumber = list.contains("cucumber");
		System.out.println("Contains cucumber: " + hasCucumber);
		
		email = "name@yahoo.com";
		if(email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		}else if(email.contains("@gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("@hotmail")){
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Car | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("No pipe");
		}
		
		
		String searchItem = "computer";
		
		String title = "Amazon.com: computer";
		
		if(title.contains(searchItem)) {
			System.out.println("Pass");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
