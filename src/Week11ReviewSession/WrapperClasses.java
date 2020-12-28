package Week11ReviewSession;

public class WrapperClasses {

	public static void main(String[] args) {


		Boolean b1 = new Boolean(true);
		Boolean b2 = Boolean.valueOf(false);
		Boolean b3 = Boolean.valueOf("true");
		
		// char doesnt accept String but char just
		
		Character c1 = new Character('a');
		Character c2 = Character.valueOf('a');
		
		Integer i1 = new Integer(100);
		Integer i2 = Integer.valueOf("100");
		Integer i3 = Integer.valueOf(100);
		
		Integer num = new Integer(10);
		
		String strNum = num.toString();
		System.out.println(strNum);
		
		System.out.println(Integer.sum(40, 30));
		System.out.println(Integer.max(40, 30));
		System.out.println(Integer.min(40, 30));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
//		Logic of Integer.compare(x,y);
//		 if first larger than second -> 1
//		 if equals -> 0
//		 if second greater than first -> -1
		
		System.out.println(Integer.compare(10, 5));
		
		// Convert a String into int
		
		String countstr = "3456";
		int count = Integer.parseInt(countstr);
		int count2 = Integer.valueOf(countstr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
