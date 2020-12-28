
public class block {
	
}

	class FinalField {
		
		private static final int number;// if our final variable is static we can initilize it in the static block if not
		// we can initilize it in the constructor. In this situation using setter method is useless and if you try the create
		// setter method by using eclipse source function. Eclipse does not allow to create setter method for final variable
		// we can use getter method the reach the value of final number
		
		private static final int num;
		static {
			number = 15;
			num =25;
		}
		
		public FinalField() {
		//this.number=15;
			
		}
		
		public int getNumber() {
			return number;
		}
//		​
	}
