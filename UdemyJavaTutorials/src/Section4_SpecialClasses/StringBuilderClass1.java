package Section4_SpecialClasses;

public class StringBuilderClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * StringBuilder class is used to create mutable (modifiable) string
		 * some useful methods
		 * append, insert, replace, delete, reverse
		 */
		
		String str1 = "I";
		str1 = str1 + " Like";
		str1 = str1 + " Java";
		
		System.out.println(str1);
		
		//I / Like/ I Like / Java/ I Like Java
		
		StringBuilder sb1= new StringBuilder("I");
		
		sb1.append(" Like");
		sb1.append(" Java");
		
		System.out.println(sb1);
	}

}
