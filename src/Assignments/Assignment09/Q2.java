package Assignments.Assignment09;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {


		System.out.println(laptopPrice());
		
	}
	
	public static String laptopPrice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select screeen size: ");
		double screenSize = sc.nextDouble();
		
		System.out.println("Select CPU type: ");
		String CPUtype = sc.next();
		
		System.out.println("Select RAM size: ");
		String RAMsize = sc.next();
		
		System.out.println("Select storage type: ");
		String storageType = sc.next();
		
		System.out.println("Enter memory size: ");
		int memorySize = sc.nextInt();
		
		System.out.println("Enter screen resolution: ");
		String scrRes = sc.next();
		
		double laptopPrice = screenSize(screenSize) + CPU(CPUtype) + RAM(RAMsize) + StorageType(storageType, memorySize) + screenResolution(scrRes);
		
		return "Laptop price is : $" + laptopPrice;
		
		
	}
	
	public static int screenSize(double screenSize) {
		
		int laptopPrice = 0;
		String scrSize = String.valueOf(screenSize);
		
		switch(scrSize) {
		case "13.3":
			laptopPrice = 200;
			break;
		case "15.0":
			laptopPrice = 300;
			break;
		case "17.3":
			laptopPrice = 400;
			break;
		}
		
		return laptopPrice;
	}
	
	public static int CPU(String CPUtype) {
		
		int laptopPrice = 0;
		
		switch(CPUtype) {
		case "i3":
			laptopPrice = 150;
			break;
		case "i5":
			laptopPrice = 250;
			break;
		case "i7":
			laptopPrice = 350;
			break;
		}
		
		return laptopPrice;
	}
	
	public static int RAM(String RAMsize) {
		
		int laptopPrice = 0;
		RAMsize = RAMsize.toUpperCase();
		RAMsize = RAMsize.replace("GB", "");
		int ramSize = Integer.parseInt(RAMsize);
		
		for(int i=0; i<ramSize/4; i++) {
			laptopPrice += 50;
		}
		
		return laptopPrice;
		
	}
	
	public static int StorageType(String storageType, int memorySize) {
		
		int laptopPrice = 0;
		storageType = storageType.toUpperCase();
		
		switch(storageType) {
		case "HDD":
			for(int i=0; i<memorySize/500; i++) {
				laptopPrice = 50;
			}
			break;
		case "SSD":
			for(int j=0; j<memorySize/500; j++) {
				laptopPrice += 100;
			}
			break;
		}
		
		return laptopPrice;
	}

	public static int screenResolution(String scrRes) {
		
		int laptopPrice = 0;
		scrRes = scrRes.toUpperCase();
		
		switch(scrRes) {
		case "FULLHD":
			laptopPrice = 100;
			break;
		case "4K":
			laptopPrice = 200;
			break;
		}
		
		return laptopPrice;
		
	}
}
