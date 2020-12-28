package Assignments.Assignment13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q78 {

	public static void main(String[] args) {
		
		String a="apple";
		String b="Ab,c,de!$";
		String c="hello world";
				
		System.out.println(reverseVowels(a));
		System.out.println(reverseVowels(b));
		System.out.println(reverseVowels(c));
		
	}

	
	public static String reverseVowels(String str) {
			
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
		ArrayList<Character> arr = new ArrayList<>();
		
		
		for(int i=0;i<str.length();i++){
			
			if(vowels.contains(str.charAt(i))) {
				arr.add(str.charAt(i));
					
				}
			}
		
		
		char[] swap = str.toCharArray();
		
		int k=0;
		
		for(int j=str.length()-1;j>=0;j--) {
			
			if(vowels.contains(str.charAt(j))) {
				swap[j]=arr.get(k);
				k++;
				
			}
			
		}
		
		return String.valueOf(swap);
		
	}
		
}

//		String str = "apple";
//		
//		System.out.println(reverseVowels(str));
//		
//	}
//	
//	public static String reverseVowels(String str) {
//		
//		String[] vowels = {"a","e","i","o","u"};
//		String newStr = "";
//		ArrayList<String> vowel = new ArrayList<>();
//		ArrayList<Integer> vowelsIndex = new ArrayList<>();
//		ArrayList<String> arr = new ArrayList<>();
//		
//		for(int i=0; i<str.length(); i++) {
//			boolean flag=true;
//			for(int j=0; j<vowels.length; j++) {
//				
//				if(str.substring(i, i+1).equalsIgnoreCase(vowels[j])) {
//					vowel.add(vowels[j]);
//					vowelsIndex.add(i);
//					flag=false;
//					break;
//				}
//			}
//			
//			if(flag) {
//				arr.add(str.substring(i, i+1));
//			}
//			
//		}
////						0				e
//		arr.add(vowelsIndex.get(0), vowel.get(1));
//		arr.add(vowelsIndex.get(1), vowel.get(0));
////						4				a
//		
//		System.out.println(vowel);
//		System.out.println(vowelsIndex);
//		System.out.println(arr);
//		
//		
//		
//		for(String value : arr) {
//			newStr += value;
//		}
//		
//		
//		
//		
//		return newStr;
//		
//	}
	
	
	
	
	
	
	
//	public static String reverseVowels(String str) {
//		
//		String vowels = "aeoiu";
//		ArrayList<String> arr = new ArrayList<>();
//		String dummy = "";
//		
//		for(int i=0; i<str.length(); i++) {
//			for(int j=0; j<vowels.length(); j++) {
//				if(str.substring(i, i+1).equalsIgnoreCase(vowels.substring(j, j+1))) {
//					arr.add(str.substring(i, i+1));
//				}
//			}
//		}
//				
//		str = str.replace(arr.get(0), arr.get(arr.size()-1));
//		dummy = str.substring(str.lastIndexOf(arr.get(arr.size()-1), str.length()));
//		dummy = arr.get(0) + dummy.substring(1);
//		str = str.substring(0, str.lastIndexOf(arr.get(arr.size()-1))) + dummy;
//		
//		
//		return str;
//		
//	}
	

