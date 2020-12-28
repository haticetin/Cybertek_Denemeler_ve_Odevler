package Assignments.Assignment04;

public class Q6 {

	public static void main(String[] args) {


		double mass, weight;
		mass=576;
		weight=mass*9.8;
		
		if(weight>1000) {
			System.out.println("It's too heavy!!!");
		}else if(weight<10) {
			System.out.println("The object is too light :)");
		}else {
			System.out.println("Normal");
		}
	}

}
