package oops_concept;

public class Road_Toll {

 String type;
 int tirecount;
 
 public void doCalculate() {
	 
	 if (tirecount == 2) {
		 System.out.println("Your toll amount is 0");
	 } else if(tirecount == 4) {
		 System.out.println("Your toll amount is 10");
	 } else if(tirecount > 4)
	 {
		 System.out.println("Your toll amount is 20");
	 }
	 else {
		 System.out.println("Incorrect tirecount");
		
	 }
		
	}
 
 public Road_Toll() {
  System.out.println("Constructor is executed");
}
 
 public Road_Toll(String type, int tirecount) {
	 this.tirecount=tirecount;
	 this.type=type;
 }
 
}
