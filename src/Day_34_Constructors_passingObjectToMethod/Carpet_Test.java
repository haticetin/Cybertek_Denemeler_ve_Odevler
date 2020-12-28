package Day_34_Constructors_passingObjectToMethod;

public class Carpet_Test {

	public static void main(String[] args) {


//		Floor f1 = new Floor(10, 12);
//		Carpet c1 = new Carpet(8);
		
//		Calculator cal = new Calculator(f1, c1); 
		
		Calculator cal = new Calculator(new Floor(10, 12), new Carpet(8)); // another way
		
		double cost = cal.getTotalCost();
		
		System.out.println(cost);
		
	}

}
