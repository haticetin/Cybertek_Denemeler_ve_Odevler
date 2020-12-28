package Week11ReviewSession;

public class VotingCheck {
	
	public static void main(String[] args) {
		
		
		
		canVote(1999);
		
		
	}
	
	public static void canVote(int birthYear) {
		
		printAge(birthYear);
		
		if(printAge(birthYear)>=18) {
			System.out.println("Eligible for vote");
		}else {
			System.out.println("Not eligible for vote");
		}
	}
	
	public static int printAge(int birthYear) {
		
		int age=2020-birthYear;
		
		System.out.println("Age : " + age);
		
		return age;
	}

}
