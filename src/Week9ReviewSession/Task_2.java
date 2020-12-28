package Week9ReviewSession;

public class Task_2 {

	public static void main(String[] args) {


		// How to print all substrings of a given string
		
		String s2 = "Cybertek";		
		
		for (int i = 0; i < 1; i++) {
            for (int j = i + 1; j <= s2.length(); j++) {
                System.out.println(s2.substring(i, j));
            }
        }

	}

}
