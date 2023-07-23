package section1_BasicJavaConcept;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.println(i +","+ j);
			}
			
			System.out.println("All Iteration of j are done");
		}
	}

}
