package section2_string_opertions;

public class String_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Equals
		 * CompareTo
		 * Matches
		 */
		
		//Equals
		String str1="ABCDE";
		String str2="aBCDE";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//CompareTo
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		//Matches
		  
		String patt= "[A-Z]{1,}";
		
		System.out.println(str1.matches(patt));
		
		
	}

}
