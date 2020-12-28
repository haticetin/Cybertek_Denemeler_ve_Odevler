package Assignments.Assignment04;

public class Q9 {

	public static void main(String[] args) {


		double weightOfPackage, ratePer500Miles, mile;
		weightOfPackage=2.4;
		ratePer500Miles=0;
		mile=550;
		
		if(mile>0) {
		
			if(weightOfPackage>0 && weightOfPackage<=2) {
				ratePer500Miles=1.10;
				if(mile>500) {
					ratePer500Miles=ratePer500Miles*2;
				}
			}else if(weightOfPackage>2 && weightOfPackage<=6) {
				ratePer500Miles=2.20;
				if(mile>500) {
					ratePer500Miles=ratePer500Miles*2;
				}
			}else if(weightOfPackage>6 && weightOfPackage<=10) {
				ratePer500Miles=3.70;
				if(mile>500) {
					ratePer500Miles=ratePer500Miles*2;
				}
			}else if(weightOfPackage>10) {
				ratePer500Miles=3.8;
				if(mile>500) {
					ratePer500Miles=ratePer500Miles*2;
				}
			}else {
				System.out.println("Not a valid weight!");
			}
					
		}else {
			System.out.println("Not a valid  weight or mile!");
		}
		
		System.out.println("The shipping charge: $" + ratePer500Miles);

	}

}
