package Section4_SpecialClasses;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner class is used to accept user inputs
		 * during execution of java program
		 */
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter the string:");
		
        String str1= s1.nextLine();
        //int i=s1.nextLine(); for integer input
        
		 System.out.println(str1);
		 
		 String temp= "";
		 
		 for (int i=0; i<= str1.length()-1; i++)
		 {
			 temp= str1.charAt(i) + temp;
			 
		 }
		 System.out.println("Reverse String is:"+temp);
	}

}
