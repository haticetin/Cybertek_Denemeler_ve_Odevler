package Day_08_Control_Flow_Statements_Part2;

public class Task_32 {

	public static void main(String[] args) {


		int a, b, c;
		a=84;
		b=76;
		c=76;
		
		if (a>b && a>c) {
			System.out.println("a: " + a + " is greatest number");
		}else if (b>a && b>c) {
			System.out.println("b: " + b + " is greatest number");
		}else if (c>a && c>b){
			System.out.println("c: " + c + " is greatest number");
		}else if(a>c && a==b && b>c) {
			System.out.println("a: " + a + " and " + "b: " + b + " are the greatest numbers");
		}else if(a>b && a==c && c>b) {
			System.out.println("a: " + a + " and " + "c: " + c + " are the greatest numbers");
		}else if(c>a && c==b && b>a) {
			System.out.println("c: " + c + " and " + "b: " + b + " are the greatest numbers");
		}else {
			System.out.println("All numbers are equal");
		}
		
	}

}
