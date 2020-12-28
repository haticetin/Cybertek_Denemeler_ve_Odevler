package Day_07_Control_Flow_Statements;

public class SmallTask2 {

	public static void main(String[] args) {


		int x,y;
		
		x=56;
		y=25;
		
		if (x > 100) {
			y=20;
		}
		else {
			y=0;
		}

		System.out.println("y = " + y);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		int x1, y1;
		
		x1=92;
		y1=100;
		
		if (y1==100) {
			x1=1;
		}
		else {
			x1=0;
		}
		
		System.out.println(x1);
		
		System.out.println("+++++++++++++++++++++++++++");

		int a, b, c;
		a=83;
		b=41;
		c=13;
		
		if (a<10) {
			b=0;
			c=1;
		}
		else {
			b=99;
			c=0;
		}
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}

}
