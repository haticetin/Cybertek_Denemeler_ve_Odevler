package Week5ReviewSession;

public class ifReview {

	public static void main(String[] args) {
		
		int drink=1, hot=2, cold=2;
		double price=0;
		String drinkName="None";
		boolean isSelected=false;
		
		if(drink==1) {
			if(hot==1) {
				drinkName="Tea";
				price=2;
				isSelected=true;
			}else if(hot==2){
				drinkName="Coffee";
				price=4;
				isSelected=true;
			}else {
				System.out.println("Invalid hot drink Selection");
			}
		}else if(drink==2) {
			if(cold==1) {
				drinkName="Icetea";
				price=3.2;
				isSelected=true;
			}else if(cold==2){
				drinkName="Lemonade";
				price=3.5;
				isSelected=true;
			}else {
				System.out.println("Invalid cold drink Selection");
			}
		}else {
			System.out.println("Invalid Selection");
		}

		if(isSelected) {
			System.out.println("Your total for " + drinkName + " is $" + price);
		}else {
			System.out.println("Please try again");
		}

		
	}
}
