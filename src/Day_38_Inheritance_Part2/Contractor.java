package Day_38_Inheritance_Part2;

public class Contractor extends Employee{

	@Override	// is like a check up
				// Annotation oldugunda method ismini, return typeni, parametreleri, access modifieri degistiremiyoruz; error veriyor
				// olmadiginda error vermiyor farkli bir metod olusturulmus gibi algiliyor
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)+200;
		System.out.println("Contractor total pay:" + total);
	}

	
}
