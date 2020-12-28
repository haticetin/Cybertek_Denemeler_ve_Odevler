package Day45_exceptions;

public class CheckedVSUncheckedException {

	public static void main(String[] args) throws Exception{

		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
