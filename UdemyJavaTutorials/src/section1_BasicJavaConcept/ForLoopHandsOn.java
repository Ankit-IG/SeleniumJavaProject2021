package section1_BasicJavaConcept;

public class ForLoopHandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* WAP to find the fibonacci series of 20 numbers
		0 1 1 2 3 5 8 13 21 
		*/
		int num1=0;
		int num2=1;
		int num3=0;
		
		for(int i=1; i<=18; i++)
		{
			num3=num1 + num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}

}
