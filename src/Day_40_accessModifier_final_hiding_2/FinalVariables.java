package Day_40_accessModifier_final_hiding_2;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 600;
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	public FinalVariables() {
		
		MODEL_3_MAXSPEED = 200;
	}
	
	{
		MODEL_X_PASSENGERS = 7;
	}
	
	static {
		ADMIN_USERNAME = "Mike";
	}
	
	

}
