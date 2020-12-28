package Day_35_Encapsulation;

public class RoulettePocket {

	private int pocketNumber;

	public RoulettePocket(int pocketNumber) {
		this.pocketNumber = pocketNumber;
		System.out.println(getPocketNumber());
	}

	public String getPocketNumber() {
		
		setPocketNumber(pocketNumber);
		
		return PocketColor(pocketNumber);
	}
	
	public void setPocketNumber(int pocketNumber) {
		
		if(pocketNumber<0 || pocketNumber>36) {
			System.out.println("Invalid input");
		}else {
			this.pocketNumber = pocketNumber;
		}
	}
	
	public String PocketColor(int pocketNumber) {
		
		if((pocketNumber>0 && pocketNumber<11) || (pocketNumber>18 && pocketNumber<29)) {
			if(pocketNumber%2==0) {
				return "black";
			}else {
				return "red";
			}
		}else if((pocketNumber>10 && pocketNumber<19) || (pocketNumber>28 && pocketNumber<37)) {
			if(pocketNumber%2==0) {
				return "red";
			}else {
				return "black";
			}
		}
		
		return "green";
		
	}

	
	
	
	
	
}
