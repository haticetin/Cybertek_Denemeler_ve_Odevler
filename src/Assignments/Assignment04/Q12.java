package Assignments.Assignment04;

public class Q12 {

	public static void main(String[] args) {


		String Package="A";
		double price, hours;
		hours=29;
		price=0;
		
		switch(Package) {
		
		case "A":
			if(hours>0 && hours<=10) {
				price=9.95;
			}else if(hours>10) {
				price=9.95+(2*(hours-10));
			}
			break;
		case "B":
			if(hours>0 && hours<=20) {
				price=13.95;
			}else if(hours>20) {
				price=13.95+(1*(hours-20));
			}
			break;
		case "C":
			if(hours>0) {
			price=19.95;
			}else {
				System.out.println("Not a valid hour");
			}
			break;
		default:
			System.out.println("Not a valid Package");
		}
		
		System.out.println("Your monthly bill: $" + price);
	}

}
