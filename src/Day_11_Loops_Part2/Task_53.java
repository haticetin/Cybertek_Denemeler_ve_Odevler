package Day_11_Loops_Part2;

public class Task_53 {

	public static void main(String[] args) {


		int i=0;
		int sumEvenNumbers=0;
		
		while(i<100) {
			if(i%2==0) {
				sumEvenNumbers=sumEvenNumbers+i;	
			}
			i++;
		}
		System.out.println(sumEvenNumbers);
	}

}
