package Day_44_OOPpractice.shapes;

import static Day_44_OOPpractice.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ShapeActions {

	public static void main(String[] args) {

		Square mySquare = new Square();
		
		ShapeManager.drawSquare(mySquare);
		drawSquare(mySquare);
		
		String type = "square";
		
		drawSquare((Square) buildShape(type));
		
		drawSquare((Square) buildShape(type));
		
		
		Object rand = new Random();
		
		System.out.println(((Random)rand).nextInt(5));
		
		System.out.println("+++++++++++++++++++++++++++");
		
		List<Shape> myList = new ArrayList<>();
		
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Diamond());
		myList.add(new Square());
		
		
		drawShape(myList);
		
		
		
	}

}
