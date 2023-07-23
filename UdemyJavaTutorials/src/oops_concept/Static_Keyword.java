package oops_concept;

public class Static_Keyword {

	/**
	 * Static Keyword
	 * Static members belong to class(Type) and not to object
	 */
	
	static String name = "Ram";
	byte age= 6;
	String grade= "1st";
	
	public void disaplayDetails() {
		System.out.println("Student "+name+" is "+age+" years old and in "+grade+" grade");
	}
	
}
