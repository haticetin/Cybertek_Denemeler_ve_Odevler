package Day_10_Control_Flow_Statements_Part4;

public class ternaryOperator {

	public static void main(String[] args) {

		String result;
		int score=88;
		
//		if(score>60) {
//			result="Pass";
//		}else {
//			result="Fail!"
//		}
		
		// bununla yukardaki tamamen ayni sey
		
		result = (score>60) ? "Pass" : "Fail!";
		 System.out.println("Result = " + result);
		// eger (score>60) dogruysa ?'dan sonrakini yap, ama eger false ise :'dan sonrakini yap
		
		//direk println'e de koyabiliriz
		 
		// condition'lar parantezsiz yazilabilir ama yazilirsa daha okunur olur
		
		//1
		int x=5;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		//2
		if(x>2) {
			if(x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
			}
		}else {
			System.out.println(7);
		}
		
		// 1 ve 2 ayni
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
