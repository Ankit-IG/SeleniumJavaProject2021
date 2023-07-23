package oops_concept;

public class Static_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_Keyword sk1 = new  Static_Keyword();
		Static_Keyword sk2 = new  Static_Keyword();
		
		sk1.age=6;
		sk1.grade="2nd";
		Static_Keyword.name="Rob";
	
		
		sk2.age=8;
		sk2.grade="3rd";
		Static_Keyword.name="Roby";
		
		sk1.disaplayDetails();
		sk2.disaplayDetails();
	}

}
