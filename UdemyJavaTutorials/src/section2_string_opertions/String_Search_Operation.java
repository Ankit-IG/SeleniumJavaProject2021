package section2_string_opertions;

public class String_Search_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Contains
		 * Starts with
		 * Ends with
		 * Index of
		 * Last Index of
		 */

		String str1="I love Java love and Selenium";
		String str2="java";
		
		//In case sensitive--
		System.out.println(str1.contains("java"));
		
		//To Ignore case--
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
	
		//Starts with
		
		System.out.println(str1.startsWith("I"));
		
		//End with
		System.out.println(str1.endsWith("Selenium"));
	
		//Index of --first occurrance
		
		// System.out.println(str1.indexOf("love"));
		
		//Index of second occurance
		
		System.out.println(str1.indexOf("love", 6));
		
		//Last Index of
		
		System.out.println(str1.lastIndexOf("love"));
		
		
	
	}
	

}
