package Week7ReviewSession;

public class Example1 {

	public static void main(String[] args) {


		int start=8;
		int end=5;
		
		if(start<end) {
			for(int i=start; i<=end; i++) {
				System.out.print(i);
			}
		}else if(start>end){
			for(int j=start; j>=end; j--) {
				System.out.print(j);
			}
		}
	}

}
