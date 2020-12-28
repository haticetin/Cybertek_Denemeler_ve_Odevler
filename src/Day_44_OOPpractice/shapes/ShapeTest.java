package Day_44_OOPpractice.shapes;

public class ShapeTest {

	public static void main(String[] args) {

		// create 4 shapes, using polymorphism
		
		Shape diamond = new Diamond();
		Shape  square = new Square();
		Shape  triangle = new Triangle();
		Object shapeObject = new Shape();
		
		
		square.draw();
		triangle.draw();
		((Square)square).squareMethod();	// Down casting: cast reference type to object type
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
