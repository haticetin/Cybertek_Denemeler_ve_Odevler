package Week7ReviewSession;

public class ContinueExample {

	public static void main(String[] args) {


		for(int i=1; i<=10; i++) {
			if(i>=2 && i<=4) {
				System.out.println("Skipping-" + i);
				continue;
			}
			
			System.out.println("i = " + i);
		}
	}

}
