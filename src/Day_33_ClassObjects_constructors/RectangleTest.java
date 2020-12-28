package Day_33_ClassObjects_constructors;

import org.w3c.dom.css.Rect;

public class RectangleTest {

	public static void main(String[] args) {


		Rectangle r1 = new Rectangle();
		
//		new call the constructor and create object
//		initialize object variables
		
		System.out.println(r1.length);	// who is giving me default values?
		System.out.println(r1.width);
		
		r1.length = 5.4;
		r1.width = 3.2;
		
		r1.getArea();
		
		Rectangle r2 = new Rectangle();
		
		r2.length = 2.7;
		r2.width = 12.5;
		
		r2.getArea();

		
		
	}

}
