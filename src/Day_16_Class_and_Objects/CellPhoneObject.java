package Day_16_Class_and_Objects;

public class CellPhoneObject {

	public static void main(String[] args) {


		CellPhone cellPhone1 = new CellPhone();
		CellPhone cellPhone2 = new CellPhone();
		CellPhone cellPhone3 = new CellPhone();
		
		cellPhone1.brand="Iphone";
		cellPhone1.color="gold";
		cellPhone1.price=350;
		cellPhone1.screenSize=4.5;
		
		cellPhone1.message();
		
		cellPhone2.brand="Samsung";
		cellPhone2.color="yellow";
		cellPhone2.price=210;
		cellPhone2.screenSize=6.5;
		
		cellPhone2.call();
		
		cellPhone3.brand="Huawei";
		cellPhone3.color="metallic";
		cellPhone3.price=250;
		cellPhone3.screenSize=6.7;
		
		cellPhone3.takeAphoto();
	}

}
