package Day_08_Control_Flow_Statements_Part2;

public class Task_35 {

	public static void main(String[] args) {


		int n1, n2, n3;
		n1=74;
		n2=45;
		n3=98;
		
		if (n1>=n2 && n1>=n3) {
			if(n1==n2 && n2==n3) {
				System.out.println("All numbers are equal");
			}else if(n1==n3) {
				System.out.println("N1: " + n1 + " and N3: " + n3 + " are the greatest numbers");		
			}else if(n1==n2) {
				System.out.println("N1: " + n1 + " and N2: " + n2 + " are the greatest numbers");		
			}else {
				System.out.println("N1: " + n1 + " is the greatest number");
			}
		}else if(n2>=n3) {
			if(n2==n3) {
				System.out.println("N2: " + n2 + " and N3: " + n3 + " are the greatest numbers");		
			}else {
				System.out.println("N2: " + n2 + " is the greatest number");
			}
		}else{
			System.out.println("N3: " + n3 + " is the greatest number");
		}
		
		
		
		
		
	}

}
