package array;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * What is an array?
		 * How to declare an array?
		 * What is the length of array?
		 * How to update the array?
		 * Iterating an array elements using for loop
		 */
		
		String [] Days= {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		System.out.println(Days.length);
		System.out.println(Days[2]);
		
		//Update
		Days[2]="RRR";
		System.out.println(Days[2]);
		
		for(int i=0; i<=Days.length-1; i++) {
			System.out.println(Days[i]);
		}
		
		//System.out.println(Days[10]); give error of outOfBound
		//Days[10]="RRR";
		
		int [] arr1= {1,2,3,4,5,6};
		
		char [] arr2= {'a', 'e', 'i'};
		
	}

}
