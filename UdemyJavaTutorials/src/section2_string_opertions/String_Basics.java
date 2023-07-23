package section2_string_opertions;

public class String_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Concatenate
		 * Length
		 * Trim
		 * UpperCase
		 * LowerCase
		 * Empty
		 */
		String str1= "De Zinnia";
		 String str2= " Institutes";
		String str3= str1 + str2 ;
        System.out.println(str3);
        
        String str4= str1.concat(str2);
        System.out.println(str4);
        
      int  num1= 100;
      
      String str5= str1 + num1;
      System.out.println(str5);
      
      System.out.println(str1.length());
      
     String str6= "  dkf  ffkdfk okdk  ";
      System.out.println(str6.trim()); 
      System.out.println(str6.toUpperCase());
      System.out.println(str6.isEmpty());
	
	}

}
