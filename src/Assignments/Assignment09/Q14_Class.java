package Assignments.Assignment09;

public class Q14_Class {

	double premium = 0;
	
	public double zipcode(int zipcode) {
		switch(zipcode) {
		case 20910: case 20740:
			premium += 60;
			break;
		case 22102: case 22103:
			premium += 30;
			break;
		default:
			premium += 50;
			break;
		}
		
		return premium;
	}
	
	public double carOwnership(String carOwnership) {
		
		carOwnership = carOwnership.toLowerCase();
		
		switch (carOwnership) {
		case "owned":
			premium += 10;
			break;
		default:
			premium += 20;
			break;
		}
		
		return premium;
		
	}
	
	public double carUsage(String carUsage) {
		
		carUsage = carUsage.toLowerCase();
		
		switch(carUsage) {
		case "business":
			premium += 50;
			break;
		case "pleasure":
			premium += 10;
			break;
		case "commute":
			premium += 20;
			break;
			
		}
		
		return premium;
	}
	
	public double daysDriven(int daysDriven) {
		
		for(int i=0; i<daysDriven; i++) {
			premium += 5;
		}
		
		return premium;
		
	}
	
	public double milesDriven(int miles) {
				
		for(int i=0; i<miles; i++) {
			premium += 1;
		}
		
		return premium;
	}
	
	public double age(int age) {
				
		if(age>=16 && age<18) {
			premium *= 20;
		}else if(age>=18 && age<=21) {
			premium *= 6;
		}else if(age>21 && age<25) {
			premium *= 2;
		}
		
		return premium;
		
	}
	
	public double drivingExperience(int yearsDriving, int age) {
		
		for(int i=0; i<yearsDriving; i++) {
			premium -= 5;
		}
		
		return premium;
		
	}
	
	public double carAccidents(int accidents) {
		
		for(int i=0; i<accidents; i++) {
			
			premium += (premium*0.2);
		}
		
		return premium;
		
	}
	
	public double hadContinuousInsurance(String hadInsurance) {
		
		return premium*2;
		
	}
	
	public double educationLevel(String educationLevel) {
		
		switch(educationLevel.toLowerCase()) {
		case "phd": case "bachelors": case "masters":
			premium -= (premium*0.05);
			break;
		case "doctors":
			premium -= (premium*0.1);
			break;
		case "less than high school":
			premium += (premium*0.05);
			break;
		}
		
		return premium;
		
	}

}
