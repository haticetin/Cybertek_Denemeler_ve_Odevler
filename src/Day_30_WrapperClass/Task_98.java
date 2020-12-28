package Day_30_WrapperClass;

import java.util.Arrays;

public class Task_98 {

	public static void main(String[] args) {


		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(decodeTheCode(str1));

        
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        System.out.println(decodeTheCode(str2));
	}

	public static int decodeTheCode(String s) {

		String str = "";
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' ') {
				str+=s.charAt(i);
			}
		}
		
		System.out.println(str);
		
		String[] arr = str.split(" ");
		
		String newStr = "";
		
		for(String value : arr) {
			
			newStr += getDigit(value);
		}
		
		int numbers = Integer.valueOf(newStr);

		return numbers;
	}

	public static String getDigit(String value) {
		
		switch(value.toUpperCase()) {
		case "ZERO":
			return 0 + "";
		case "ONE":
			return 1 + "";
		case "TWO":
			return 2 + "";
		case "THREE":
			return 3 + "";
		case "FOUR":
			return 4 + "";
		case "FIVE":
			return 5 + "";
		case "SIX":
			return 6 + "";
		case "SEVEN":
			return 7 + "";
		case "EIGHT":
			return 8 + "";
		case "NINE":
			return 9 + "";
		}
		
		return "";
	}

}
