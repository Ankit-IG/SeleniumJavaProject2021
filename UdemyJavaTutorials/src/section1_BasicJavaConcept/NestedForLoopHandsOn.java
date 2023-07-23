package section1_BasicJavaConcept;

public class NestedForLoopHandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		WAP to create pattern
		
		*
		**
		***
		*****
		******
		 */
           
		for (int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println("\n");
		}
	
	}
	
	

}
