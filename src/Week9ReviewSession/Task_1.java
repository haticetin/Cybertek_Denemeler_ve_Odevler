package Week9ReviewSession;

public class Task_1 {

	public static void main(String[] args) {


		//How to get a particular substring
        
        
		String s1 = "The best Java core course in Europe is Cybertek. End of story.";
		
		String myTarget = "course";
		
		int index1 = s1.indexOf(myTarget);
		int index2 = index1 + myTarget.length();
		
		
		System.out.println(s1.substring(index1, index2));
	
	
	
	
	}

}
