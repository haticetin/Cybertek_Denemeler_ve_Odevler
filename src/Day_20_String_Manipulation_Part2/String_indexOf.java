package Day_20_String_Manipulation_Part2;

public class String_indexOf {

	public static void main(String[] args) {

		String word = "github";
		System.out.println(word.indexOf("g"));
		System.out.println(word.indexOf("th"));
		System.out.println(word.indexOf("hub"));
		System.out.println(word.indexOf("java"));
		System.out.println(word.indexOf(" "));
		
		String url = "www.okta.com";
		int i=url.indexOf(".");			// indexOf() is giving the first position of that char in the argument
		System.out.println("Position of . " + i);
		
		System.out.println(url.charAt(i+1));
		System.out.println(url.indexOf(url.charAt(7)));		// Pointless
		
		// find position of '-' and check if space is on right and left side
		
		String title = "Java - Google Search";
		
		int indexDash = title.indexOf('-');
		System.out.println(indexDash);
		System.out.println(title.charAt(indexDash-1));
		System.out.println(title.charAt(indexDash+1));
		System.out.println("Apple");
		
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of States:" + states);
		
		String word2 = "Java, C++, Python, Tomcat, Eclipse";
		// check if c++ is in word2
		
		// 1st Way
		if(word2.contains("C++")) {
			System.out.println("C++ is there");
		}else {
			System.out.println("C++ is not there");
		}
		
		// 2nd Way
		if(word2.indexOf("JavaScript")>-1) {
			System.out.println("C++ is there");
		}else {
			System.out.println("C++ is not there");
		}
		
		
		
		
		
		
		
	}

}





















