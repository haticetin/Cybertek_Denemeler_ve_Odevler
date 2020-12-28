package Assignments.Assignment04;

public class Q5 {

	public static void main(String[] args) {


		int day, twoDigitYear, number, monthNumeric; 
		String month="March";
		day=27;
		twoDigitYear=98;
		number=1;
		monthNumeric=number;
		
		switch(month) {
		case "January":
			break;
		case "February":
			monthNumeric=number+1;
			break;
		case "March":
			monthNumeric=number+2;
			break;
		case "April":
			monthNumeric=number+3;
			break;
		case "May":
			monthNumeric=number+4;
			break;
		case "June":
			monthNumeric=number+5;
			break;
		case "July":
			monthNumeric=number+6;
			break;
		case "August":
			monthNumeric=number+7;
			break;
		case "September":
			monthNumeric=number+8;
			break;
		case "October":
			monthNumeric=number+9;
			break;
		case "November":
			monthNumeric=number+10;
			break;
		case "December":
			monthNumeric=number+11;
			break;				
		}
		
		System.out.println(monthNumeric + "/" + day + "/" + twoDigitYear);
		
		if(monthNumeric*day==twoDigitYear) {
			System.out.println("The date is magic");
		}else {
			System.out.println("The date is not magic");
		}
	}

}
