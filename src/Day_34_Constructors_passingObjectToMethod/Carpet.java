package Day_34_Constructors_passingObjectToMethod;

public class Carpet {

	double cost;
	
	public Carpet(double cost) {
		
		this.cost = cost;
		
		if(cost<0) {
			this.cost=0;
		}
		
	}
	
	public double getCost() {
		return cost;
	}

}
