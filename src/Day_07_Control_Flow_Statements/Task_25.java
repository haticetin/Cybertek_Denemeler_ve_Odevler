package Day_07_Control_Flow_Statements;

public class Task_25 {

	public static void main(String[] args) {


		int d, f, g, h;
		d=3861;
		f=5678;
		g=1067;
		h=7650;
		boolean con1, con2, con3, con4;
		con1 = d>f && d>g && d>h; // bunlari direk if () kismina yazarak da yapabilirsin
		con2 = f>d && f>g && f>h;
		con3 = g>f && g>d && g>h;
		con4 = h>d && h>f && h>g;
		
		if (con1 == true) {
			System.out.println("The greatest number is: " + d);
		}
		
		if (con2 == true) {
			System.out.println("The greatest number is: " + f);
		}
		
		if (con3 == true) {
			System.out.println("The greatest number is: " + g);
		}
		
		if (con4 == true) {
			System.out.println("The greatest number is: " + h);
		}

	}

}
