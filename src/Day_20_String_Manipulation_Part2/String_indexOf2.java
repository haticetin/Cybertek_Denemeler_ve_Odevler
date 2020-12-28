package Day_20_String_Manipulation_Part2;

public class String_indexOf2 {

	public static void main(String[] args) {


		// index of with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf('-');
		
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);	// first going to fromIndexOf then String
		
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		
		System.out.println(lastDash);
		
		int x = list.lastIndexOf("-", 28);
		System.out.println(x);
		System.out.println(list.charAt(x));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
