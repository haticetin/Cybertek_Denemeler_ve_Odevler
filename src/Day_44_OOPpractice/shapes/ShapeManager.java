package Day_44_OOPpractice.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {

	public static Shape buildShape(String type) {
		
		Shape shape = null;
		
		switch(type.toLowerCase()) {
		case "shape":
			shape = new Shape();
			break;
		case "diamond":
			shape = new Diamond();
			break;
		case "triangle":
			shape = new Triangle();
			break;
		case "square":
			shape = new Square();
			break;
		}
		
		return shape;
		
	}
	
	public static void drawSquare(Square squareObject) {
		System.out.println("Drawing a square");
		squareObject.draw();
		
	}
	
	public static void drawShape(Shape shape) {
		System.out.println("Drawing a shape");
		shape.draw();
	}
	
	public static void drawShape(List<Shape> shapeList) {
		
		for(Shape each : shapeList) {
			each.draw();
		}
		
		
		
	}
	
}
