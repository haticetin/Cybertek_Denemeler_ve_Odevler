package Day_15_Method_Overloading;

public class Assignment1_SwapValues {

	public static void main(String[] args) {


		int n1=10;
		int n2=20;
		int n3;
		
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("================");
		
		n3=n1;
		n1=n2;
		n2=n3;
		
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
		System.out.println("================");
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("N1 = " + n1);
		System.out.println("N2 = " + n2);
	}

}
