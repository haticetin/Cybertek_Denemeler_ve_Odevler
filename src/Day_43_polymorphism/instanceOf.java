package Day_43_polymorphism;

import java.util.List;
import java.util.ArrayList;

public class instanceOf {

	public static void main(String[] args) {


		Shape sh = new Circle();
		
		if(sh instanceof Triangle) {
			System.out.println("Triangle");
		}else if(sh instanceof Circle) {
			System.out.println("Circle");
		}else {
			System.out.println("Square");
		}
	
		List<Shape> shapeList = new ArrayList<Shape>();
		
		shapeList.add(new Triangle());
		shapeList.add(new Circle());
		
		
	}

}
