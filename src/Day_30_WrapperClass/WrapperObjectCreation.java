package Day_30_WrapperClass;

public class WrapperObjectCreation {

	public static void main(String[] args) {


		// Wrapper Object Creation
		
				Boolean b1 = new Boolean(true);
				Boolean b2 = new Boolean("true");
				Boolean b3 = Boolean.valueOf(false);
				Boolean b4 = Boolean.valueOf("false");
				
				Character c1 = new Character('c');
				Character c2 = Character.valueOf('c');
				
//										->	->	-> int(default) algiladigi icin cast yapmamiz lazim
//										|
				Byte bt1 = new Byte((byte)123);
				Byte bt2 = new Byte("123");
				Byte bt3 = Byte.valueOf((byte)123);
				Byte bt4 = Byte.valueOf("123");
				
//										->	->	->	->	default olarak int algiladigi icin cast etmemiz gerekiyo
				Short s1 = new Short((short)1200);
				Short s2 = new Short("1200");
				Short s3 = Short.valueOf((short)1200);
				Short s4 = Short.valueOf("1200");
				
				Integer it1 = new Integer(1202);
				Integer it2 = new Integer("1202");
				Integer it3 = Integer.valueOf(1202);
				Integer it4 = Integer.valueOf("1202");
				
				Float f1 = new Float(12.2f);
				Float f2 = new Float("12.2");
				Float f3 = Float.valueOf(12.2f);
				Float f4 = Float.valueOf("12.2");
	}

}
