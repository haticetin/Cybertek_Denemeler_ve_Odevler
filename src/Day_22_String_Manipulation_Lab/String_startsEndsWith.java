package Day_22_String_Manipulation_Lab;

public class String_startsEndsWith {

	public static void main(String[] args) {


		String word1 = "Eclipse";
		
		System.out.println(word1.startsWith("E"));
		System.out.println(word1.startsWith("Ec"));
		System.out.println(word1.startsWith("Ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));


		
		// Mr. => married man
		// Mrs. => married woman
		// Ms. => unmarried woman
		// Dr. => Doctor man or woman
		// No title => Unknown status
		
		
		String name  = "Ms. Hatice Kubra Cetin";
		
		if(name.startsWith("Mr")) {
			System.out.println("The person is a married man");
		}else if(name.startsWith("Mrs")) {
			System.out.println("The person is a married woman");
		}else if(name.startsWith("Ms")) {
			System.out.println("The person is an unmarried woman");
		}else if(name.startsWith("Dr")) {
			System.out.println("The person is a doctor");
		}else {
			System.out.println("Unknown status");
		}
		
		
		
		
		
		
		
		
		

	}

}
