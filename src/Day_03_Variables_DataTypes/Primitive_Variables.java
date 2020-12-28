package Day_03_Variables_DataTypes;

public class Primitive_Variables {

	public static void main(String[] args) {

		byte b1 = 25;
		byte b2 = -25;
		// byte b3 = 128; alan yetmiyor
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 588;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		// 100_00 -> alt cizgi sayiyi daha iyi okunmasini sagliyor. i3 ile i4 ayni
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		long l1 = 500; // suffix l is optional. Literal 5000 is of int type
		long l2 = -24564322666L;
		// long -> default -> int yani suffix is mandatory, this number is out of range
		long l3 = +491631765808L;
		// sor bunu. 1) + niye print etmedi ama kabul etti? 2) 0 ile neden baslayamiyoruz?
		long AccountNumber = 1009_4567_8246_5769_54l;
		
		System.out.println("My number is " + l3);
		System.out.println("My account number is " + AccountNumber);
		System.out.println("Do you know " + l2 + " number");
		System.out.println("I have " + l1 + "cm cube house");
		
		float f1 = 2.1f;
		// long ile ayni mantikla isliyor. float -> default -> double. Suffix -> F,f mandatory
		//ne float olabilir?
		double pi = 3.14;
		
		System.out.println("f1 = " + f1);
		System.out.println("Pi is equal to " + pi);
		
		
		char c1 = 'A';
		char c2 = 65; // decimal value for A in Html
		char c3 = '\u0041';
		System.out.println(c3);
		char c4 = 7645;
		// unicode table 'dan istedigini bulabilirsin. (unicode-table.com)
		System.out.println(c4);
		
		
		boolean status = true;
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam " + status);
		
		String name = "Kubra.";
		System.out.println("My name is " + name);
		
		// WAYS TO CREAT VARIABLES
		//1:
		int price=5;
		int quantity=14;
		int total=price*quantity;
		
		//2:
		int price2=5,quantity2=14;
		int total2=price2*quantity2;
		
		//3:
		int price3, quantity3, total3;
		price3=5;
		quantity3=14;
		total3=price3*quantity3;
		
		System.out.println(total * price3/ total2 + total3);
		
		String a1,a2;
		a1 = "am unteren Schlossberg 25 = ";
		a2 = "Heilbronner str. 1 = ";
		boolean realAddress = true;
		boolean exAddress = false;
		
		
		
		System.out.println(a1 + realAddress);
		System.out.println(a2 + exAddress);
		
		//int sum, String value; -> does not compile
		int sum; String value;
		
		String firstname, lastname, address, nationality;
		firstname = "Hatice Kubra";
		lastname = "Cetin";
		address = "am unteren Schlossberg 25";
		nationality = "Turkish";
		 
		System.out.println(firstname + lastname);
		System.out.println(address);
		System.out.println(nationality);
		
		/* Rules for Identifiers (Variables or Class Name):
		 * -> first character should be one of the letters a-z or A-Z, an underscore (_) or a dollar sign ($).
		 * -> after first character can be letters a-z or A-Z, digits 0-9, underscores (_), dollar sign ($).
		 * 		Valid Example:
		 * 		String my20thBirthday$;
		 * 		int ageOfthe_Employer100;
		 * 		Invalid Example:
		 * 		int ageOfthe@Employer100;  => @
		 * 		String my20th Birthday$;   => space
		 * -> reserve key words (red things=>public, static, void, int, ...) CANNOT be used as variable name
		 */
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
			
		
				

	}

}
