package Assignments.Assignment11;

public class Q40 {

	public static void main(String[] args) {


		String[] arr = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
		
		System.out.println(longestLength(arr));
		
	}

	public static String longestLength(String[] arr) {
		
		String longestWord = arr[0];
		
		for(String value : arr) {
			if(value.length()>longestWord.length()) {
				longestWord = value;
			}
		}
		
		return longestWord;
	}

}
