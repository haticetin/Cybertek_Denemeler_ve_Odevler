package Day_26_Arrays_Part3;

import java.util.Arrays;

public class Task_94 {

	public static void main(String[] args) {


		String info1 = "This info is used for creation password : xxxCD132Gxxx. Please do"
				+ " not share with anyone";
		
		String info2 = "This info is used for creation password : xxx00ABC!xxx. Please do"
				+ " not share with anyone";
		
		
		String[] infoArray1 = info1.split("password :");
		String[] infoArray2 = info2.split("password :");
		
		String pass1 = infoArray1[1].split(". Please")[0];	// I assigned the splitted array's [0]
		String pass2 = infoArray2[1].split(". Please")[0];	// to pass1 and pass2
		
		String pass = pass1.trim().substring(3, 9) + pass2.trim().substring(3, 9);
		
		////////////// OR //////////////

		pass1 = pass1.substring(4, 10);
		pass2 = pass2.substring(4, 10);
		
		String Pass = pass1.trim() + pass2.trim();
		
		System.out.println("pass: " + pass);
		System.out.println("Pass: " + Pass);
		
		
		//////////////////////// OR //////////////////////////
				
		String[] array1 = info1.split("xxx");
		String[] array2 = info2.split("xxx");
		
		System.out.println(Arrays.toString(array1));
		
		String password = array1[1]+array2[1];
		
		System.out.println("Password: " + password);

		
		
		
		
		
		
		
		
		
		
		
	}

}
