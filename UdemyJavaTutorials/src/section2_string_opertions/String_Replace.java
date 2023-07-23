package section2_string_opertions;

public class String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Replace- Normal
		 * ReplaceAll- RegEx
		 */
		
		String str1= "CONCENTRAT1234ON 1234MROVES W1234TH PRACT1234CE";
		String str2= "1234";
		String str3= "I";
		
		System.out.println(str1.replace(str2, str3));
		
		//ReplaceAll- RegEx
		
		String str4= "EITHER*$% YOU&&^ CONTROL YOUR#$ MIND#$% OR IT WILL CONTR*&OL YOU";
		String patt= "[^A-Za-z0-9\\s]";
		 System.out.println(str4.replaceAll(patt, ""));
		 
	}
	

}
