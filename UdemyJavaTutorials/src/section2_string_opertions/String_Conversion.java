package section2_string_opertions;

public class String_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * toString
		 * toBinaryString
		 * toHexString
		 * toOctalString
		 * parseInt
		 */
		
		int num=100;
		System.out.println(Integer.toString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
		
		String str1="100";
		String str2="1010101";
		String str3= "64";
		String str4= "144";
		
		System.out.println(Integer.parseInt(str1));
		System.out.println(Integer.parseInt(str2, 2));
		System.out.println(Integer.parseInt(str3, 16));
		System.out.println(Integer.parseInt(str4, 8));
		
	}

}
