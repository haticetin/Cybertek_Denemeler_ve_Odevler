package Day_34_Constructors_passingObjectToMethod;

import Day_18_Reading_User_Input.changeMaker;

public class Apple_Test {

	public static void main(String[] args) {

		Apple a1 = new Apple();

		changeApple(a1);
		
		methodObject().color = "Brown";
		
		changeApple(methodObject());
		
		Apple c1 = methodObject();
	
	
	}
	
	public static Object changeApple(Apple b1) {
	
		return b1.color = "Yellow";
		
	}
	
	public static Apple methodObject() {
		
		Apple a1 = new Apple();
		
		return a1;
		
	}

}
