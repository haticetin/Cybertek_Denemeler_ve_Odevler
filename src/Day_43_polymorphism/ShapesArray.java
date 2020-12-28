package Day_43_polymorphism;

public class ShapesArray {

	public static void main(String[] args) {


		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Square();
		shapes[1] = new Triangle();
		shapes[2] = new Circle();
		
		for(Shape obj : shapes) {
			System.out.println(obj.getClass().getName());
			obj.draw();
			System.out.println(obj.getClass().getSimpleName());
			
		}
		
		
		
		
	}

}
