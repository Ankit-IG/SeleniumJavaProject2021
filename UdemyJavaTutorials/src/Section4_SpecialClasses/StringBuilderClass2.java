package Section4_SpecialClasses;

public class StringBuilderClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * some useful methods
		 * insert, replace, delete, reverse
		 */
		StringBuilder sb1=new StringBuilder("Learning is fun");
		
		sb1.insert(9, "Java ");
		
		System.out.println(sb1);
		
		sb1.replace(9, 13, "Everything");
		
		System.out.println(sb1);
		
		//end index is exclusive, right here the end index is 12 but we put it as 13
		
		sb1.deleteCharAt(0);
		
		System.out.println(sb1);
		
		sb1.delete(2, 9);
		
		System.out.println(sb1);
		
		sb1.reverse();
		
		System.out.println(sb1);
		
		
		
	}

}
